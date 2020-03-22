package com.gradle.java;
 import java.util.Random;

public class SnakeAndLadder {

    static int PLAYER1_COUNT=100,PLAYER2_COUNT=100,pos_count1=0,pos_count2=0;


    public static void Gamer1()
    {
        Random rand1=new Random();
        if (pos_count1 <PLAYER1_COUNT )
        {
            int dicevalue=rand1.nextInt(6)+1;
            int checkvalue=rand1.nextInt(3);
            pos_count1=(pos_count1+dicevalue);
            if(checkvalue==0)
                pos_count1=pos_count1;
            else if (checkvalue==1)
            {
                pos_count1=pos_count1;
                switch(pos_count1)
                {
                    case 11:pos_count1=31; break;
                    case 20:pos_count1=40; break;
                    case 50:pos_count1=89; break;
                    case 60:pos_count1=98; break;
                    default:pos_count1=pos_count1;
                }
            }
            else
            {
                pos_count1=pos_count1;
                switch(pos_count1)
                {
                    case 21:pos_count1=5; break;
                    case 30:pos_count1=10; break;
                    case 55:pos_count1=17; break;
                    case 99:pos_count1=20; break;
                    default:pos_count1=pos_count1;
                }
            }
        }
        if (pos_count1==100)
            System.out.println("Gamer1 won The Game!");
        else 
            Gamer2();
    }
    public static void Gamer2()
    {
        Random rand1=new Random();
        if (pos_count2 <PLAYER2_COUNT )
        {
            int dicevalue=rand1.nextInt(6)+1;
            int checkvalue=rand1.nextInt(3);
            pos_count2=(pos_count2+dicevalue);
            if(checkvalue==0)
                pos_count2=pos_count2;
            else if (checkvalue==1)
            {
                pos_count1=pos_count2;
                switch(pos_count2)
                {
                    case 11:pos_count2=31; break;
                    case 20:pos_count2=40; break;
                    case 50:pos_count2=89; break;
                    case 60:pos_count2=98; break;
                    default:pos_count2=pos_count2;
                }
            }
            else
            {
                pos_count2=pos_count2;
                switch(pos_count2)
                {
                    case 21:pos_count2=5; break;
                    case 30:pos_count2=10; break;
                    case 55:pos_count2=17; break;
                    case 99:pos_count2=20; break;
                    default:pos_count2=pos_count2;
                }
            }
        }
        if (pos_count2==100)
            System.out.println("Gamer2 won The Game!");
        else
            Gamer1();
    }    


    public static void main(String []args) {
        System.out.println("------------------------Welcome to Snake And Ladder++++++++++++++++++++");
    Random rand=new Random();
     int toss=rand.nextInt(2);
     if(toss==1) {
         System.out.println("Gamer1 Won The Toss:");
         Gamer1();
     }
     else {
         System.out.println("Gamer2 Won The Toss:");
         Gamer1();
     }
    }
}