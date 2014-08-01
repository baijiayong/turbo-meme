package com.baldurtech;

public class FizzBuzzTest
{
    static Boolean testResult = true;
    
    public static void main(String args[])
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String  actualResult = null;
        actualResult = fizzBuzz.say(1);
        if(false == assertEquals("1",actualResult))
        {
            testResult = false;
            System.out.println("Expected 1 But " + fizzBuzz.say(1) );
        }
        actualResult = fizzBuzz.say(2);
        if(false == assertEquals("2",actualResult))
        {
            testResult = false;
            System.out.println("Expected 2 But " + fizzBuzz.say(2) );
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