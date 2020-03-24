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
       try {
           boolean result1 = UserRegUtils.isValidFirstName("999");
           Assert.assertTrue(result1);
           boolean result2 = UserRegUtils.isValidFirstName("Sube");
           Assert.assertTrue(result2);
       }catch (UserRegException e){
           e.printStackTrace();
       }
    }
    @Test
    public void givenFirstName_WhenInValid_ReturnFalse() throws UserRegException {
        try {
            assertFalse(UserRegUtils.isValidFirstName("9999"));
            assertFalse(UserRegUtils.isValidFirstName("S"));
            assertTrue(UserRegUtils.isValidFirstName("Sube"));
            assertFalse(UserRegUtils.isValidFirstName("subE"));
            assertFalse(UserRegUtils.isValidFirstName("Sube007@"));
            assertFalse(UserRegUtils.isValidFirstName("subedar"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenValid_ReturnTrue() throws UserRegException {
        try {
            boolean result1 = UserRegUtils.isValidLastName("Chaurasiya");
            assertFalse(result1);
            boolean result2 = UserRegUtils.isValidLastName("007");
            assertFalse(result2);
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenInValid_ReturnFalse() throws UserRegException {
        try {
            assertFalse(UserRegUtils.isValidLastName("007"));
            assertFalse(UserRegUtils.isValidLastName("sube"));
            assertFalse(UserRegUtils.isValidLastName("sUBE"));
            assertFalse(UserRegUtils.isValidLastName("SUBE@"));
            assertFalse(UserRegUtils.isValidLastName("suBE"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmailAdd_WhenValid_ReturnTrue() throws UserRegException  {
        try {
            assertTrue(UserRegUtils.isValidEmailAddr("su"));
            assertTrue(UserRegUtils.isValidEmailAddr("BE"));
            assertTrue(UserRegUtils.isValidEmailAddr("007"));
            assertTrue(UserRegUtils.isValidEmailAddr("dube@gmail.com"));
            assertTrue(UserRegUtils.isValidEmailAddr("abc-100@yahoo.com"));
            assertTrue(UserRegUtils.isValidEmailAddr("abc007@jahoo.com"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmailAdd_WhenInValid_ReturnFalse() throws UserRegException {
        try {
            assertFalse(UserRegUtils.isValidEmailAddr("su"));
            assertFalse(UserRegUtils.isValidEmailAddr("BE"));
            assertFalse(UserRegUtils.isValidEmailAddr("007"));
            assertFalse(UserRegUtils.isValidEmailAddr(".abc@gmail.com.aa.au"));
            assertFalse(UserRegUtils.isValidEmailAddr("abc@gmail.com.a"));
            assertFalse(UserRegUtils.isValidEmailAddr("abc@gmail.com.a1"));
            assertFalse(UserRegUtils.isValidEmailAddr("abc()*@gmail.com"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenPhoneNo_WhenValid_ReturnTrue() throws UserRegException {
        try {
              assertTrue(UserRegUtils.isValidPhoneNo("su"));
              assertTrue(UserRegUtils.isValidPhoneNo("BE"));
              assertTrue(UserRegUtils.isValidPhoneNo("!@#$"));
              assertTrue(UserRegUtils.isValidPhoneNo("7055969834"));
              assertTrue(UserRegUtils.isValidPhoneNo("9999999999"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenPhoneNo_WhenInValid_ReturnFalse() throws UserRegException {
        try {
            assertFalse(UserRegUtils.isValidPhoneNo("su"));
            assertFalse(UserRegUtils.isValidPhoneNo("BE"));
            assertFalse(UserRegUtils.isValidPhoneNo("!@#$"));
            assertFalse(UserRegUtils.isValidPhoneNo("91 7055969834"));
            assertFalse(UserRegUtils.isValidPhoneNo("91809068555117"));
            assertFalse(UserRegUtils.isValidPhoneNo("917 055969834"));
            assertFalse(UserRegUtils.isValidPhoneNo(" 685117"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenPasswd_WhenValid_ReturnTrue() throws UserRegException {
        try {
            assertTrue(UserRegUtils.isValidPasswd("@@@@"));
            assertTrue(UserRegUtils.isValidPasswd("007"));
            assertTrue(UserRegUtils.isValidPasswd("aaa"));
            assertTrue(UserRegUtils.isValidPasswd("SSSSS"));
            assertTrue(UserRegUtils.isValidPasswd("@Sube@007@"));
            assertTrue(UserRegUtils.isValidPasswd("Sube@@007"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenPasswd_WhenInValid_ReturnFalse() throws UserRegException {
        try {
            assertFalse(UserRegUtils.isValidPasswd("@@@@"));
            assertFalse(UserRegUtils.isValidPasswd("007"));
            assertFalse(UserRegUtils.isValidPasswd("aaa"));
            assertFalse(UserRegUtils.isValidPasswd("DDUUBBEE"));
            assertFalse(UserRegUtils.isValidPasswd("s77@@s@"));
            assertFalse(UserRegUtils.isValidPasswd("Sube@07"));
            assertFalse(UserRegUtils.isValidPasswd("SSSSHHHHH"));
            assertFalse(UserRegUtils.isValidPasswd("ssssshhhh"));
            assertFalse(UserRegUtils.isValidPasswd("Su@&@7"));
            assertFalse(UserRegUtils.isValidPasswd("sube@@007"));
        }catch (UserRegException e){
            e.printStackTrace();
        }
    }

}
