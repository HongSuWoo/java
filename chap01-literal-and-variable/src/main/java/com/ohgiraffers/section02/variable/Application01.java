package com.ohgiraffers.section02.variable;

public class Application01
{

    public static void main(String[] args)
    {

        System.out.println("==========값에 의미 부여 테스트 ==========");
        System.out.println("보너스를 포함한 급여 : " + ( 10000000 + 2000000) + "원" );
        System.out.println("==========값에 의미 부여 테스트 ==========");
        // 백만원 이하는 절상
        int v,a,p=90,p2=90; //변수 선언문
        v = 10; // 변수 초기화


        int salary = 10;
        int bonus = 2;
        //System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        for(a=0;a<=8;a++)
            {
            System.out.println("1번 고객에게 포인트"+ (p+=10) +"포인트 지급하였습니다.");
           // System.out.println("1번 고객에게 포인트"+ p +"포인트 지급하였습니다.");
           // p=p+10;

           // System.out.println("2번 고객에게 포인트"+ (p2+10) +"포인트 지급하였습니다.");

        }


    }

}
