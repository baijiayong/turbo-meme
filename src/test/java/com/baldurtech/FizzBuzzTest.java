package com.baldurtech;

public class FizzBuzzTest
{
    static Boolean testResult = true;
    
    public static void main(String args[])
    {
        String  actualResult = null;
        outputTestReport(testResult);
    }
    public static void test_1_should_be_1()
    {
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        assertEquals("1",fizzBuzz1.say(1));
    }
       
    public static void test_2_should_be_2()
    {
        FizzBuzz fizzBuzz2 = new FizzBuzz();
        assertEquals("2",fizzBuzz2.say(2));
    }
         
    public static void test_3_should_be_Fizz()
    {
        FizzBuzz fizzBuzz3 = new FizzBuzz();
        assertEquals("Fizz",fizzBuzz3.say(3));
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
    public static void assertEquals(String expectedResult, String actualResult)
    {
        if(false == expectedResult.equals(actualResult))
        {
            testResult = false;
            System.out.println("Expected " + expectedResult + " But " + actualResult );
        } 
    }
}