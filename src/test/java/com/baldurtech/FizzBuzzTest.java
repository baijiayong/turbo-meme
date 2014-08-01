package com.baldurtech;

public class FizzBuzzTest
{
    static Boolean testResult = true;
    
    public static void main(String args[])
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String  actualResult = null;
        actualResult = fizzBuzz.say(1);
        if( ! "1".equals(actualResult))
        {
            testResult = false;
            System.out.println("Expected 1 But " + fizzBuzz.say(1) );
        }
        actualResult = fizzBuzz.say(2);
        if( ! "2".equals(actualResult))
        {
            testResult = false;
            System.out.println("Expected 2 But " + fizzBuzz.say(2) );
        }
        if(testResult)
        {
           System.out.println("Test Success!"); 
        }else
        {
            System.out.println("Test Failed!");
        }
    }
}