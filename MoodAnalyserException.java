package com.gradle.java;

public class MoodAnalyserException extends Exception {
    enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;
    public MoodAnalyserException(String message){
        super(message);
    }
}
