package com.bridgeLab.userReg;

public class MoodAnalyser {

	private String mood;
	public MoodAnalyser() {
		
	}
    public MoodAnalyser(String message) {
		mood = message;
	}
	public String analyseMood() {
	    try {
	     	if( mood.contains("sad"))
			  return "SAD";
		else
		  return "HAPPY";
	    }
	    catch(NullPointerException e) {
		    return "HAPPY";
	     }
	}
}
