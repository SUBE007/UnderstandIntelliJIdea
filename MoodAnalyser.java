package com.gradle.java;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(String message) {
        this.message= message;
    }
    public MoodAnalyser() {

    }

    public String analyseMood() throws MoodAnalyserException {
     try {
        if (message.length()==0)
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"EnteredEmptyException");
        else if (message.equals("happy"))
            return "happy";
        else
            return "sad";
    }
    catch (NullPointerException e){
        throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"EnteredNullException");
      }
    }

    public boolean equals(Object another){
        if (this.message.equals(((MoodAnalyser)another).message))
            return true;
        else
        return false;
    }

    public boolean equalsMethod_ForObject(Object mess){
        if (this == mess)
            return true;
        else
        return false;
    }

 }//class MoodAnalyser
