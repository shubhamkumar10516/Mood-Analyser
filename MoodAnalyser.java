package com.bridgeLab.userReg;

import com.bridgeLab.userReg.MoodAnalysisException.Exception_type;

public class MoodAnalyser {

	private String mood;
	public MoodAnalyser() {
		
	}
    public MoodAnalyser(String message) {
		mood = message;
	}
	public String analyseMood()throws MoodAnalysisException {
	    try {
	    	if(mood.length() == 0)
	    		throw new MoodAnalysisException(Exception_type.EMPTY_TYPE, "This is empty mood");
	     	if( mood.contains("sad"))
			  return "SAD";
		    else
		      return "HAPPY";
	    }
	    catch(NullPointerException e) {
		   throw new MoodAnalysisException(Exception_type.NULL_TYPE, "Please enter proper message");
	     }
	}
}
