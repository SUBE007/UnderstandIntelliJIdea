package com.gradle.java;

 import com.opencsv.CSVReader;
 import com.opencsv.CSVReaderBuilder;

 import java.io.IOException;
 import java.io.Reader;
 import java.nio.file.Files;
 import java.nio.file.Paths;
 import java.util.List;

public class OpenCsvReader {

    public static void main(String[] args) throws IOException {

       // Reader reader= Files.newBufferedReader(Paths.get( "F:\\AgainShell\\OPENCSV\\open.csv")); //without header
        Reader reader= Files.newBufferedReader(Paths.get( "F:\\AgainShell\\OPENCSV\\withheader.csv"));//with header
       // CSVReader csvReader=new CSVReader(reader);
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();


        //reading one by one
//            String[] nextRecord;
//            while ((nextRecord = csvReader.readNext()) != null) {
//                System.out.println("Name : " + nextRecord[0]);
//                System.out.println("Email : " + nextRecord[1]);
//                System.out.println("Phone : " + nextRecord[2]);
//                System.out.println("Country : " + nextRecord[3]);

        //reading all at Once
        List<String[]> records = csvReader.readAll();
        for (String[] record : records) {
            System.out.println("Name : " + record[0]);
            System.out.println("Email : " + record[1]);
            System.out.println("Phone : " + record[2]);
            System.out.println("Country : " + record[3]);
            System.out.println("---------------------------");

        }
    }
}
