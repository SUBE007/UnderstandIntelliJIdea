package com.gradle.java;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinSimulation {

    public static double flipCoinSimulation(int number,int cointime)
    {
        int count1=0;
        Random rand = new Random();
        double hc1=0,tc1=0;
        String[] strarray =new String[number];
          for(int i=0;i<number;i++)
        {
            String str="";
            for(int j=0;j<cointime;j++)
            {

                int hc= rand.nextInt(2);
                if(hc==1) {
                    str=str+"H";
                    hc1++;
                }
                else {
                    str=str+"T";
                    tc1++;
                }

            }
            strarray[count1++]=str;
        }
        System.out.println("Number of head:"+hc1);
        System.out.println("Number of tail:"+tc1);
        double headper=hc1/(hc1+tc1)*100;
        double tailper=tc1/(hc1+tc1)*100;
        System.out.println("head percentage:"+headper+ "%");
        System.out.println("tail Percentage:"+tailper+ "%");
        for (String s : strarray) {
            System.out.print(s + " ");
        }
        System.out.println();
        return headper;
    }
public  static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    double[] winces =new double[3];
     int count=0;
   for(int i=0;i<3;i++) {
        System.out.println("Enter How many time want to flip coin:");
        int number = sc.nextInt();
        System.out.println("Enter How many coin want to flip:");
        int coins = sc.nextInt();

        double d1=FlipCoinSimulation.flipCoinSimulation(number, coins);
       winces[ count++ ]=d1;
      }

    for (double wince : winces)
        System.out.println("Winning Combination:" + wince + " ");
}

}//class
