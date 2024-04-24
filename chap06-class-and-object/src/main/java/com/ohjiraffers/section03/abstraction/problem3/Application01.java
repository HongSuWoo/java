package com.ohjiraffers.section03.abstraction.problem3;

public class Application01
{
    public static void main(String[] args)
    {   //dto mvc
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po = new Car();
        po.setName("포르쉐");

        CarRacer hong = new CarRacer();
        hong.setCar(ram);
        hong.myCarInfo();

        hong.startUp();

        hong.go();
        hong.stop();
        hong.turnOff();

    }


}
