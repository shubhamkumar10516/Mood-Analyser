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
    	 moodAnalyser = new MoodAnalyser("I am in sad mood");
    	 Assert.assertEquals("SAD", moodAnalyser.analyseMood());
         Assert.assertNotEquals("HAPPY", moodAnalyser.analyseMood());
     }
     
	 @Test
     public void whenHappy_returnHappy() {
		 moodAnalyser = new MoodAnalyser("I am in happy mood");
    	 Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
         Assert.assertNotEquals("SAD", moodAnalyser.analyseMood());
     }
	 @Test
     public void whenNull_returnHappy() {
		 moodAnalyser = new MoodAnalyser(null);
    	 Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
         Assert.assertNotEquals("NULL", moodAnalyser.analyseMood());
     }
}
