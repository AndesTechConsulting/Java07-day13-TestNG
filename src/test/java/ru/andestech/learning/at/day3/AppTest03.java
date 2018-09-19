package ru.andestech.learning.at.day3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

//import org.testng.reporters.jq.

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class AppTest03 {

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

    public void testE()
    {
        System.out.println("++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( 1==1 );
    }

    public void testF()
    {
        System.out.println("++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( 1==1 );
    }

    @DataProvider(name = "summData")
    public static Object[][] getData()
    {
        return new Object[][]
                {{1,2,3},{3,7,10},{-3,3,0}};

    }

    @Test(dataProvider = "summData")
    public void paramTest(int a, int b, int res)
    {
       assertEquals(a+b, res);

    }

}
