package com.ohjiraffers.section03.abstraction.problem2;

public class Application01
{
    public static void main(String[] args)
    {
        Car car = new Car();
        CarRacer carRacer = new CarRacer();

        carRacer.startUp(car);
        carRacer.go(car);
        carRacer.stop(car);
        carRacer.turnOff(car);


    }


}
