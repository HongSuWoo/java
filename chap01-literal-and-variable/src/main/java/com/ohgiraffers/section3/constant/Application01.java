package com.ohgiraffers.section3.constant;

public class Application01
{

    public static void main(String[] args)
    {
     /*
     상수란?
     값이 변하지 못하는 변수.
      */
    final int AGE=10;
//    AGE = 20;
    int age = AGE;
    System.out.println(age);
        age = 20;
    System.out.println(age);




    }
}
