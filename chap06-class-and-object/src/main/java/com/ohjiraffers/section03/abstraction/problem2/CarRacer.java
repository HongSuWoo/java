package com.ohjiraffers.section03.abstraction.problem2;

public class CarRacer
{
    private Car car;
    public void startUp(Car car)
    {
        car.startUp();
    }

    public void turnOff(Car car)
    {
        car.turnOff();
    }


    public void go(Car car)
    {
        car.go();
    }

    public void stop(Car car)
    {
        car.stop();
    }

}

