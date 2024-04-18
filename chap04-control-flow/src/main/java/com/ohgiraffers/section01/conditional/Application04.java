package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application04
{
    public static void main(String[] args)
    {
        Application04 app = new Application04();
               //app.call(); 이란 app.call 에서 return 값을 의미한다.
        String doobi = app.call();
        System.out.println(app.call());
    }

    public String call()
    {
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Enter an integer: ");

        String input=sc.nextLine();// 문자열을 받는 input 아이한테.

        String[] target = input.split(" "); /// 첫번째수 띄어쓰기 부호 띄어쓰기 두번째수
        //int 자료형을 가진 result 를 '선언'하고, 0으로 '초기화'한다.
        int result=0; //result = 0                             // target[0]=첫번째수 taget[1]=부호 target[2]=두번째수
        System.out.printf("target[0]=%s   \ntarget[1]=%s    \ntarget[2]=%s \n",target[0],target[1],target[2]);

        if(target[1].equals("+")) // / == +
            result = Integer.parseInt(target[0])+Integer.parseInt(target[2]);
        else if(target[1].equals("-"))
            result = Integer.parseInt(target[0])-Integer.parseInt(target[2]);
        else if(target[1].equals("*"))
            result = Integer.parseInt(target[0])*Integer.parseInt(target[2]);
        else if(target[1].equals("/"))
            result = Integer.parseInt(target[0])/Integer.parseInt(target[2]);
                    //해당하는 문자열이 강제로 정수로 바뀝니다. 정수로 바뀐 양쪽의수를 중간에 기호로 계산한다.
        else
            System.out.println("제대로 입력해라");

        return " "+result;


    }

}

