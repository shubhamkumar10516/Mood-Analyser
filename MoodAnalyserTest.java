package com.bridgeLab.userReg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bridgeLab.userReg.MoodAnalysisException.Exception_type;

public class MoodAnalyserTest {

	 public MoodAnalyser moodAnalyser = null;
	 
     @Before
     public void initialization() {
    	 moodAnalyser = new MoodAnalyser("I am in happy mood");
     }
     
     @Test
     public void whenSad_returnSad() {
    	 moodAnalyser = new MoodAnalyser("I am in sad mood");
		 String mood = null;
		 try {
			mood =  moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood );
		 }catch(MoodAnalysisException e) {
			 e.printStackTrace();
		 }
     }
     
	 @Test
     public void whenHappy_returnHappy() {
		 moodAnalyser = new MoodAnalyser("I am in happy mood");
		 String mood = null;
		 try {
			mood =  moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood );
		 }catch(MoodAnalysisException e) {
			 e.printStackTrace();
		 }
    	 
     }
	 @Test
     public void whenNull_HandleIt() {
		 moodAnalyser = new MoodAnalyser(null);
		 try {
			  moodAnalyser.analyseMood();
		}catch(MoodAnalysisException e) {
			 Assert.assertEquals(Exception_type.NULL_TYPE, e.type);
		 }
      }
	 @Test
     public void whenEmpty_HandleIt() {
		 moodAnalyser = new MoodAnalyser("");
		 try {
			  moodAnalyser.analyseMood();
		}catch(MoodAnalysisException e) {
			 Assert.assertEquals(Exception_type.EMPTY_TYPE, e.type);
		 }
      }
}
