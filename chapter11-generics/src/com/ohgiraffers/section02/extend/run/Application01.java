package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

import java.util.Random;

public class Application01
{
    public static void main(String[] args)
    {
       // 애니멀 클래스는 래빗의 조상타입으로 타입이 맞지 않음
      // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
       //얘도 타입이 레빗보다 상위에 있어서 안되여
       // RabbitFarm<mMammal> farm2 =new RabbitFarm<mMammal>()
        //뱀새끼는 토끼쪽에 상속이 아니므로 안된다.
       // RabbitFarm<Snake> farm3=new RabbitFarm<Snake>();
        // 토깽은 토깽과 같은 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>(new Rabbit());
        farm4.getAnimal().cry();
        //버니는 토끼의 자식
        RabbitFarm<Bunny> farm5 = new RabbitFarm<Bunny>();
        //얘는 손자 토끼의
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<DrunkenBunny>();
        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }

}
