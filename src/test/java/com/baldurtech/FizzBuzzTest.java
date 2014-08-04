package com.baldurtech;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;

public class FizzBuzzTest
{
    static Boolean testResult = true;
    
    public static void main(String args[]) throws Exception
    {   
        List<Method> testMethods = new ArrayList<Method>();
        Method[] methods = FizzBuzzTest.class.getDeclaredMethods();
        for(Method method : methods) 
        {
            if(method.getName().startsWith("test"))
            {
                testMethods.add(method);
            }
        }
        for(Method method : testMethods)
        {
            System.out.println("Testing: " + method.getName());
            Object obj = FizzBuzzTest.class.newInstance(); 
            method.invoke(obj,new Object[]{});
        }
        
        outputTestReport(testResult);
    }
    FizzBuzz fizzBuzz = new FizzBuzz();
    public void test_1_should_be_1()
    {
        assertEquals("1",fizzBuzz.say(1));
    }
       
    public void test_2_should_be_2()
    {
        assertEquals("2",fizzBuzz.say(2));
    }
         
    public void test_3_should_be_Fizz()
    {
        assertEquals("Fizz",fizzBuzz.say(3));
    }
    
    public static void assertEquals(String expectedResult, String actualResult)
    {
        if(false == expectedResult.equals(actualResult))
        {
            testResult = false;
            System.out.println("Expected " + expectedResult + " But " + actualResult );
        } 
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
}