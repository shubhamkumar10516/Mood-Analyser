package com.bridgeLab.userReg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

	 public MoodAnalyser moodAnalyser = null;
	 
     @Before
     public void initialization() {
    	 moodAnalyser = new MoodAnalyser("I am in sad mood");
     }
     
	 @Test
     public void whenSad_returnSad() {
    	 Assert.assertEquals("SAD", moodAnalyser.analyseMood());
         Assert.assertNotEquals("HAPPY", moodAnalyser.analyseMood());
     }
}
