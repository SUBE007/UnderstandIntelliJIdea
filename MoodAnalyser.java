package com.gradle.java;

public class MoodAnalyser {
   private String message;
    public MoodAnalyser(String message) {
        this.message= message;
    }

    public static String stringMessage(String message) {
    return message;
}
    public static String stringMessageHappyBad(String message) throws MoodAnalyserException {
    try {
        if (message.length()==0)
            throw new MoodAnalyserException("Please Enter proper Value");
        else if (message.equals("happy"))
            return "happy";
        else
            return "sad";
    }
    catch (NullPointerException e){
            throw new MoodAnalyserException("Please Enter proper Value");

    }
    }


}
