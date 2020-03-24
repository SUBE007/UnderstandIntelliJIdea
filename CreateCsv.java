package com.gradle.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateCsv {
    public static void main(String []args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter(new File("F:\\AgainShell\\OPEN CSV\\CommaSepratedValue.csv"));
        StringBuilder sb=new StringBuilder();

        sb.append("Book_Sl");
        sb.append(",");
        sb.append("Book_Title");
        sb.append(",");
        sb.append("Catagory_Name");
        sb.append(",");
        sb.append("Author_Name");
        sb.append(",");
        sb.append("Publisher_Name");
        sb.append(",");
        sb.append("\r\n");

        sb.append("1");
        sb.append(",");
        sb.append("BookTitle1");
        sb.append(",");
        sb.append("CatagoryName1");
        sb.append(",");
        sb.append("AuthorName1");
        sb.append(",");
        sb.append("PblisherName1");
        sb.append("\r\n");

        sb.append("2");
        sb.append(",");
        sb.append("BookTitle2");
        sb.append(",");
        sb.append("CatagoryName2");
        sb.append(",");
        sb.append("AuthorName2");
        sb.append(",");
        sb.append("PblisherName2");
        sb.append("\r\n");

        pw.write(sb.toString());
        pw.close();
        System.out.println("Data Added Successfully!");
    }
}
