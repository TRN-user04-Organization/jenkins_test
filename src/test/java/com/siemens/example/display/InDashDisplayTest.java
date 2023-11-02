package com.siemens.example.display;

import junit.framework.TestCase;

/**
 * Created by denis.rubik on 8/25/2016.
 */
public class InDashDisplayTest  extends TestCase {

  public void testAudioDisplayData() {
      AudioDisplay audio = new AudioDisplay ();
      assertEquals("Audio Display", audio.displayData());
  }

  public void testAudioDisplayId() {
      AudioDisplay audio = new AudioDisplay ();
      assertEquals("audioDisplay", audio.displayId());
  }
  
  public void testPhoneDisplayData() {
      PhoneDisplay phone = new PhoneDisplay ();
      assertEquals("Phone Display", phone.displayData());
  }

  public void testPhoneDisplayId() {
      PhoneDisplay phone = new PhoneDisplay ();
      assertEquals("phoneDisplay", phone.displayId());
  }

  public void testVehSafetyDisplayData() {
      VehSafetyDisplay veh = new VehSafetyDisplay ();
      assertEquals("VehSafety Display", veh.displayData());

  }

  public void testVehSafetyDisplayId() {
      VehSafetyDisplay veh = new VehSafetyDisplay ();
      assertEquals("vehSafetyDisplay", veh.displayId());
  }

}
