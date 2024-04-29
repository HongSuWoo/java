package com.ohgiraffers.section01.extend;

public class RacingCar extends Car
{
    @Override
    public void soundHorn() {
        System.out.println("레이싱은 경적없어");
    }

    @Override
    public void stop() {
        System.out.println("레이싱이 멈춘대");
    }

    @Override
    public void run() {
        System.out.println("레이싱이 전속력으로 달린대");
    }


    public RacingCar()
    {
        super();
        System.out.println("Racing car 클래스 기본 생성자 호출");

    }
}
