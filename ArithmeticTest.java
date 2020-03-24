package com.mood.testcase;

import com.gradle.java.Arithmetic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArithmeticTest {
   private int firstNumber;
   private int secondNumber;
   private int expetedResult;
   private Arithmetic arithmetic;

   public ArithmeticTest(int firstNumber,int secondNumberumber,int expetedResult){
       super();
       this.firstNumber=firstNumber;
       this.secondNumber=secondNumberumber;
       this.expetedResult=expetedResult;
   }
   @Before
    public void initilize(){
       arithmetic=new Arithmetic();
   }
   @Parameterized.Parameters
    public static Collection input(){
       return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{15,16,31},{10,20,30},{100,200,300}});
   }
   @Test
    public void arithmeticTest(){
       System.out.println("Sum of Number:"+expetedResult);
       Assert.assertEquals(expetedResult,arithmetic.sum(firstNumber,secondNumber));
   }

}
