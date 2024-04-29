package com.ohgiraffers.section04;

public class FireCar extends Car implements Soundale
{
    @Override
    public void go() {
        System.out.println("소방차가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void horn() {

        System.out.println("삐용삐용삐용");
    }
}
