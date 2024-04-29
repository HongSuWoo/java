package com.ohgiraffers.section02.extend;
                        //레빗이라는애 상위타입만 가능하다 T
public class RabbitFarm <T extends Rabbit>
{
    private T animal;

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public RabbitFarm()
    {

    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
