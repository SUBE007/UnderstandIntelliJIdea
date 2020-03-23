package com.mood.testcase;

import com.gradle.java.UserRegException;
import com.gradle.java.UserRegUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRegTest {
    @Test
    public void givenFirstName_WhenValid_ReturnTrue() throws UserRegException {
    boolean result= UserRegUtils.isValidFirstName("Sube");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInValid_ReturnFalse() throws UserRegException {
         assertFalse(UserRegUtils.isValidFirstName("Sube@"));
         assertFalse(UserRegUtils.isValidFirstName("S"));
         assertTrue(UserRegUtils.isValidFirstName("Sube"));
         assertFalse(UserRegUtils.isValidFirstName("subE"));
         assertFalse(UserRegUtils.isValidFirstName("Sube007@"));
         assertFalse(UserRegUtils.isValidFirstName("subedar"));
    }
    @Test
    public void givenLastName_WhenValid_ReturnTrue() throws UserRegException {
        boolean result= UserRegUtils.isValidLastName("Chaurasiya");
        assertFalse(result);
    }
    @Test
    public void givenLastName_WhenInValid_ReturnFalse() throws UserRegException {
        assertFalse(UserRegUtils.isValidLastName("sube"));
        assertFalse(UserRegUtils.isValidLastName("SUBE"));
        assertFalse(UserRegUtils.isValidLastName("SUBE@"));
        assertFalse(UserRegUtils.isValidLastName("suBE"));

    }
    @Test
    public void givenEmailAdd_WhenValid_ReturnTrue() {
        assertFalse(UserRegUtils.isValidEmailAddr("dube@gmail.com"));
        assertFalse(UserRegUtils.isValidEmailAddr("abc-100@yahoo.com"));
        assertFalse(UserRegUtils.isValidEmailAddr("abc007@jahoo-com"));

    }
    @Test
    public void givenEmailAdd_WhenInValid_ReturnFalse() throws UserRegException {
        assertFalse(UserRegUtils.isValidEmailAddr("abc@gmail.com.aa.au"));
        assertFalse(UserRegUtils.isValidEmailAddr("abc@gmail.com.a"));
        assertFalse(UserRegUtils.isValidEmailAddr("abc@gmail.com.a1"));
        assertFalse(UserRegUtils.isValidEmailAddr("abc()*@gmail.com"));

    }
    @Test
    public void givenPhoneNo_WhenValid_ReturnTrue() {
        assertTrue(UserRegUtils.isValidPhoneNo("91 7055969834"));
        assertTrue(UserRegUtils.isValidPhoneNo("91 8090685117"));

    }
    @Test
    public void givenPhoneNo_WhenInValid_ReturnFalse() {
        assertFalse(UserRegUtils.isValidPhoneNo("91 7055969834"));
        assertFalse(UserRegUtils.isValidPhoneNo("91809068555117"));
        assertFalse(UserRegUtils.isValidPhoneNo("917 055969834"));
        assertFalse(UserRegUtils.isValidPhoneNo(" 685117"));

    }
    @Test
    public void givenPasswd_WhenValid_ReturnTrue() {
          assertTrue(UserRegUtils.isValidPasswd("@Sube@007@"));
          assertTrue(UserRegUtils.isValidPasswd("Sube@@007"));

    }
    @Test
    public void givenPasswd_WhenInValid_ReturnFalse() {
        assertFalse(UserRegUtils.isValidPasswd("@@@@@@@@"));
        assertFalse(UserRegUtils.isValidPasswd("Sube@07"));
        assertFalse(UserRegUtils.isValidPasswd("SSSSHHHHH"));
        assertFalse(UserRegUtils.isValidPasswd("ssssshhhh"));
        assertFalse(UserRegUtils.isValidPasswd("Su@&@7"));
        assertFalse(UserRegUtils.isValidPasswd("sube@@007"));

    }

}
