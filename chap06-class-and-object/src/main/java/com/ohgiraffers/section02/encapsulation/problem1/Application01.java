package com.ohgiraffers.section02.encapsulation.problem1;

public class Application01
{
    public static void main(String[] args)
    {
    Monster drunkTiger =new Monster();
    drunkTiger.name = "술취한 고냥이";
   // drunkTiger.hp   = -100;

    System.out.println(drunkTiger.name+ "  ");
    //System.out.println(drunkTiger.hp);
    // --- 직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.
    Monster mon= new Monster();
    mon.name = "주황버섯";
    mon.setHP(-100);
  //  System.out.println(mon.hp);
  //  mon.hp = -100;
    System.out.println(mon.gethp());



    }

}
