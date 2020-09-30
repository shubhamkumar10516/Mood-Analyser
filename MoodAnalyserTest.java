package com.bridgeLab.userReg;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
public class MoodAnalyserTest {

	 public MoodAnalyser moodAnalyser = null;
	 
     @Before
     public void initialization() {
    	 moodAnalyser = new MoodAnalyser();
     }
     
	 @Test
     public void whenSad_returnSad() {
    	 Assert.assertEquals("SAD", moodAnalyser.analyseMood("This is sad message"));
         Assert.assertEquals("HAPPY", moodAnalyser.analyseMood("This is happy news"));
         
     }
     
     
     
}
