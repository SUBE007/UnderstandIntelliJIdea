package com.mood.testcase;

import com.gradle.java.MoodAnalyser;
import com.gradle.java.MoodAnalyserException;
import com.gradle.java.MoodAnalyserFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MoodTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("happy");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void givenMood_WhenNull_ShouldReturnNullException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMood_WhenEmpty_ShouldReturnEmptyException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = "";
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenMood_Nomethod_ThenReturn_CustomException_WithNoSuchMETHOD() {
        try {
            MoodAnalyserFactory.createMoodAnalyserObject();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("NO_SUCH_METHOD_EXCEPTION", e.getMessage());
        }
    }
    @Test
    public void whenMood_Method_ThenReturn_CustomException_WithNoSuchMETHOD() {
        try {
            MoodAnalyserFactory.createMoodAnalyserObject("Subedar");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("NO_SUCH_METHOD_EXCEPTION", e.getMessage());
            Assert.assertEquals("NO_SUCH_CLASS_EXCEPTION", e.getMessage());
        }
    }

}