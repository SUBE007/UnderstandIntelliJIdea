package com.gradle.java;

import java.util.Scanner;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static int calEmpWageForCompany(int empRate, int numOfDay, int MaxHr) {
        int empHr = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        int[] wageArray =new int[numOfDay]; int count=0;
        while (totalEmpHrs <=MaxHr && totalWorkingDays < numOfDay) {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHr = 4;
                    break;
                case IS_FULL_TIME:
                    empHr = 8;
                    break;
                default:
                    empHr = 0;
            }
            totalEmpHrs += empHr;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr:" + empHr);
            wageArray[count++]=empHr*empRate;
         }
        for (int i=0;i<wageArray.length;i++)
        {
            System.out.print(wageArray[i]+",");
        }
        System.out.println();
        return totalEmpHrs*empRate;
    }
public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter for How Many company U Want to Calculate TotalWage alongwith daily Wage:");
    int noOfCmp=sc.nextInt();
    int count=0;
    int companywages[] =new int[noOfCmp];
    for (int i=1;i<=noOfCmp;i++)
    {
         System.out.println("Enter EmpRate,No.Of Day,Maxhr For Company:"+i);
         int empRate=sc.nextInt();
         int noOfDay=sc.nextInt();
         int maxHr=sc.nextInt();
         int totalWage=EmpWageBuilder.calEmpWageForCompany(empRate,noOfDay,maxHr);
         System.out.println("Total Wages for company "+i+":"+totalWage);
         companywages[count++]=totalWage;
      }
    System.out.print("All Company Total Wages:");
    for (int i=0;i<companywages.length;i++)
    {
        System.out.print(companywages[i]+",");
    }

}//main()
}//class EmpWageBuilder
