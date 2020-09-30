package com.bridgeLab.userReg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

	 public MoodAnalyser moodAnalyser = null;
	 
     @Before
     public void initialization() {
    	 moodAnalyser = new MoodAnalyser("I am in happy mood");
     }
     
	 @Test
     public void whenSad_returnSad() {
    	 Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
         Assert.assertNotEquals("SAD", moodAnalyser.analyseMood());
     }
}
