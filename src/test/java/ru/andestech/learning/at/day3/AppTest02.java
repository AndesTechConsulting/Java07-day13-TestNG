package ru.andestech.learning.at.day3;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertTrue;

public class AppTest02 {

    public AppTest02(){
        System.out.println("++ ctor " + this);

    }

    @Test()
    public void testB()
    {
        System.out.println("++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( 1==1-3+1+1+1 );

    }

    @Test(dependsOnMethods = {"testB"})
    public void testC()
    {
        System.out.println("++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );

    }

    private int i =-1;
    private final static int N = 4;

    private static int[] arr =
            new int[N];

    static {
        for (int i=0; i<N; i++)
            arr[i] = new Random().nextInt(3);
    }

    @Test(invocationCount = N, successPercentage = 40)
    public void testD()
    {
        i++;
        System.out.println(i + "++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( 1==i );
        System.out.println("after assert " +i);

    }




}
