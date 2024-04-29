package com.ohgiraffers.section04;

public class RacingCar extends Car
{
    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다.");

    }

    @Override
    public void stop() {
        System.out.println("레이싱카는 멈추지 않아!");
    }

    @Override
    public void horn() {

    }
}
