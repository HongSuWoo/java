package com.ohgiraffers.section02.extend;

public class WildCardFarm
{

    public void anyType(RabbitFarm<?> farm)
    {
        farm.getAnimal().cry();
    }
//bunny이거나 그 후손타입으로 만들어진 토끼농장만매개변수로 사요ㅕㅇ이가능하대
    public void extendsType(RabbitFarm<? extends Bunny> farm)
    {
        farm.getAnimal().cry();
    }
    //토깽농장의 토끼는 버니이거나 그 부모타입으로 만들어진 토끼농장만 매개변수 사용 가능
    public void superType(RabbitFarm<? super Bunny> farm)
    {
        farm.getAnimal().cry();
    }

}
