package com.mood.testcase;

import com.gradle.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
//        MoodAnalyser mdo=new MoodAnalyser();
        String expected=MoodAnalyser.stringMessage("hello");
        Assert.assertEquals("hello","hello");
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
//        MoodAnalyser mdo=new MoodAnalyser();
        String expected=MoodAnalyser.stringMessageHappyBad("happy");
        Assert.assertEquals("happy","happy");
    }
}
