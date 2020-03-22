package com.mood.testcase;

import com.gradle.java.UserRegException;
import com.gradle.java.UserRegUtils;
import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {
    @Test
    public void givenFirstName_WhenValid_ReturnTrue() throws UserRegException {
    boolean result= UserRegUtils.isValidFirstName("Sube");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInValid_ReturnFalse() throws UserRegException {
        boolean result= UserRegUtils.isValidFirstName("Sube@");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenValid_ReturnTrue() throws UserRegException {
        boolean result= UserRegUtils.isValidLastName("Dube");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenInValid_ReturnFalse() throws UserRegException {
        boolean result= UserRegUtils.isValidLastName("@Sube@007");
        Assert.assertFalse(result);

    }
    @Test
    public void givenEmailAdd_WhenValid_ReturnTrue() {
        boolean result= UserRegUtils.isValidEmailAddr("dube@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailAdd_WhenInValid_ReturnFalse() throws UserRegException {
        boolean result= UserRegUtils.isValidLastName("subedube.com");
        Assert.assertFalse(result);

    }
    @Test
    public void givenPhoneNo_WhenValid_ReturnTrue() {
        boolean result= UserRegUtils.isValidPhoneNo("7055919837");
        Assert.assertTrue(result);

    }
    @Test
    public void givenPhoneNo_WhenInValid_ReturnFalse() {
        boolean result= UserRegUtils.isValidPhoneNo("705591@@007");
        Assert.assertFalse(result);

    }
    @Test
    public void givenPasswd_WhenValid_ReturnTrue() {
        boolean result= UserRegUtils.isValidPasswd("@Sube@007@");
        Assert.assertTrue(result);

    }
    @Test
    public void givenPasswd_WhenInValid_ReturnFalse() {
        boolean result= UserRegUtils.isValidPasswd("Sube@7");
        Assert.assertTrue(result);

    }

}
