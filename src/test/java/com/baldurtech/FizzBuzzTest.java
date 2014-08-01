package com.baldurtech;

public class FizzBuzzTest
{
    static Boolean testResult = true;
    
    public static void main(String args[])
    {
        String  actualResult = null;
        
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        actualResult = fizzBuzz1.say(1);
        if(false == assertEquals("1",actualResult))
        {
            testResult = false;
            System.out.println("Expected 1 But " + fizzBuzz1.say(1) );
        }
        
        FizzBuzz fizzBuzz2 = new FizzBuzz();
        actualResult = fizzBuzz2.say(2);
        if(false == assertEquals("2",actualResult))
        {
            testResult = false;
            System.out.println("Expected 2 But " + fizzBuzz2.say(2) );
        }
        
        FizzBuzz fizzBuzz3 = new FizzBuzz();
        actualResult = fizzBuzz3.say(3);
        if(false == assertEquals("Fizz",actualResult))
        {
            testResult = false;
            System.out.println("Excepted Fizz But " + fizzBuzz3.say(3));
        }
        outputTestReport(testResult);
    }
    public static void outputTestReport(Boolean testResult)
    {
        if(testResult)
        {
           System.out.println("Test Success!"); 
        }else
        {
            System.out.println("Test Failed!");
        }
    }
    public static Boolean assertEquals(String expectedResult, String actualResult)
    {
        return expectedResult.equals(actualResult);
    }
}