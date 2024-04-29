package com.ohgiraffers.section02.abstractclass;

import java.sql.SQLOutput;

public class SmartPhone extends Product
{


    @Override
    public void absMethod()
    {
        System.out.println("프로덕트 클래스의 abs메소드를 오버라이딩한 메소드를 호출함");

    }
    public void printSmartPhone()
    {
        System.out.println("스마트폰 클래스의 프린트 스마트 폰 메소드를 호출함");


    }


}



