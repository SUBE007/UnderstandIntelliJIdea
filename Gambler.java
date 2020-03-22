package com.gradle.java;
 import java.util.Scanner;

public class Gambler {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter stack goal number: ");
		   int stack=sc.nextInt();
		   int goal=sc.nextInt();
		   int n=sc.nextInt();
		  try {
			 gamblingStart(stack, goal, n);
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}
	public static void gamblingStart(int stack, int goal, int n)  {
		Scanner sc=new Scanner(System.in);
  	double w = 0, l = 0;
		if (stack <= 0 || stack > goal || n <= 0)
			System.out.println("either one of stack goal number invalid");
		while (stack > 0 && stack != goal && n > 0) {
			System.out.println("Enter The bet Ammount:");
			int bet = sc.nextInt();
			if (bet > stack) {
				System.out.println("bet ammount is more than Stack");
			}
			if (Math.random() > 0.5) {
				System.out.println("you won the Bet:");
				stack = stack + bet;
				if (stack == goal)
					break;
				w++;
			} else {
				System.out.println("u lost the bet:");
				stack = stack - bet;
				l++;
			}
			System.out.println("stack :" + stack);
			n--;
		} // while
		System.out.println("No. of Wins:" + w);
		System.out.println("No. of lost:" + l);
		System.out.println("% of Wins:" + w / (w + l) * 100);
		System.out.println("% of lost:" + l / (w + l) * 100);
		System.out.println("Stack:" + stack);
	}
 }
