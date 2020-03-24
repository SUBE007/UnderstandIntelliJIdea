package com.gradle.java;

public class UserRegUtils {

    public static boolean isValidFirstName(String firstName) throws UserRegException {

            if (firstName.matches("[0-9]*"))
                 throw new UserRegException("FirstNameInvalidException");
            else
                return firstName.matches("^[A-Z][a-z\\s]{1,}");//"[A-Z][a-z]*" );

    }

    public static boolean isValidLastName(String lastName) throws UserRegException {
        if (lastName.matches("[0-9]*"))
            throw new UserRegException("lastNameInvalidException:");
        else
            return lastName.matches("[A-Z]+([ '-][a-zA-Z]+)*");

    }

    public static boolean isValidEmailAddr(String email) throws UserRegException{
        if (email.matches("[0-9]*")||email.matches("[a-z]*")||email.matches("[A-Z]*"))
            throw new UserRegException("EmailInvalidException");
        else
            return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    public static boolean isValidPhoneNo(String phno) throws UserRegException {
        if (phno.matches("[a-z]*")||phno.matches("[A-Z]*")||phno.matches("[!@#$%^&*]*"))
            throw new UserRegException("PhoneNumberInvalidException");
        else
            return phno.matches("(0/91)?[7-9][0-9]{9}");
    }

    public static boolean isValidPasswd(String pass) throws UserRegException {
        if (pass.matches("[0-9]*")||pass.matches("[A-Z]*")||pass.matches("[!@#$%^&]*")||pass.matches("[a-z]*"))
            throw new UserRegException("PassWordInvalidException");
        else
            return pass.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})");
    }

}//class
