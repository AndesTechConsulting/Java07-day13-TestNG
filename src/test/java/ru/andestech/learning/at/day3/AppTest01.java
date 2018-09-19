package ru.andestech.learning.at.day3;


import org.testng.annotations.*;

import static  org.testng.Assert.*;

public class AppTest01
{

    @BeforeSuite
    public static void globalInit(){
        System.out.println("+++!!! " +
                Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @AfterSuite
    public static void globalFree(){
        System.out.println("---!!! " +
                Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @BeforeTest
    public static void testInit(){
        System.out.println("+++!!! " +
                Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @AfterTest
    public static void testFree(){
        System.out.println("---!!! " +
                Thread.currentThread().getStackTrace()[1].getMethodName());

    }


    @Test(priority = 100)
    public void testA()
    {
        System.out.println("++ " +
        Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );

    }
}
