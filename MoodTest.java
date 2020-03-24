package com.mood.testcase;

import com.gradle.java.MoodAnalyser;
import com.gradle.java.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
//        MoodAnalyser mdo=new MoodAnalyser();
        String expected=MoodAnalyser.stringMessage("This is Sad message");
        Assert.assertEquals(expected,"This is Sad message");
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalyserException {
//        MoodAnalyser mdo=new MoodAnalyser();
        try {
            String expected=MoodAnalyser.stringMessageHappyBad("happy");
            Assert.assertEquals("happy","happy");
        }
       catch (MoodAnalyserException e){
            e.printStackTrace();
       }
    }
     @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=null;
        try {
            ExpectedException exceptionRule=ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood=moodAnalyser.stringMessageHappyBad(null);
        }
        catch (MoodAnalyserException e){
          Assert.assertEquals("Please Enter proper Value",e.getMessage());
        }
     }

}
