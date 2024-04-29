package com.ohgiraffers.section02.abstractclass;

public abstract class Product
{
    private int nonStatiField;
    private static int statiField;

    public Product()
    {
    }

    public void nonStaticMethod()
    {
        System.out.println("Product 클래스의 nonStatiField 호출함");


    }
    public static void staticMethod()
    {
        System.out.println("Product 클래스의 staticMethod 호출함");


    }

    public abstract void absMethod();
}
