package com.siemens.example.display;

import java.awt.Graphics;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.JComponent;
import javax.swing.JFrame;

import static java.awt.SystemColor.window;


class CenterDisplay extends JComponent {
    public void paint(Graphics g) {
        g.drawRect (10, 10, 200, 200);
        g.drawString(new AudioDisplay().displayData(), 20, 40);
        g.drawString(new PhoneDisplay().displayData(), 20, 80);
        g.drawString(new VehSafetyDisplay().displayData(), 20, 120);
    }
}

public class MainDisplay {
    public static void main(String[] args) {

        Properties prios = new Properties();
        InputStream in = MainDisplay.class.getResourceAsStream("configuration.properties");
        try {
            prios.load(in);
            in.close();
        } catch (Exception e) {
            System.out.println("There was an error loading the properties file");
        }

        Enumeration keys = prios.keys();
        while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)prios.get(key);
            System.out.println(key + ": " + value);
        }

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new CenterDisplay());
        window.setVisible(true);
    }
}
