package com.gradle.java;
import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 try
		 {
		 System.out.println("Enter first name of user:");
		 String fname=sc.nextLine();
		 System.out.println("FirstName Valid ?:"+UserRegUtils.isValidFirstName(fname));

			 System.out.println("Enter last name of user:");
			 String lname=sc.nextLine();
			 System.out.println("LastName Valid ?:"+UserRegUtils.isValidFirstName(lname));

			 System.out.println("Enter email of user:");
		     String email=sc.nextLine();
			 System.out.println("Email Valid ?:"+UserRegUtils.isValidEmailAddr(email));

			 System.out.println("Enter mobile no. of user:");
		     String phno=sc.nextLine();
			 System.out.println("Phone No. Valid ?:"+UserRegUtils.isValidPhoneNo(phno));

			 System.out.println("Enter password:");
		     String passwd=sc.nextLine();
			 System.out.println("Password Valid ?:"+UserRegUtils.isValidPasswd(passwd));
		 }
        catch (UserRegException e) {
	                  e.printStackTrace();
       }//catch
	}//main

}//class
