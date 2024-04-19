package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_dowhile
{
    public void testSimpledowhileStatement()
    {
        /*
        do-while문 표현식
        초기식;
        do{
        내용
           }while(조건식);
         */
        do
        {
        System.out.println("do while 은 일 단 실행");
        }while(false);
    }


    public void testDowhileExample()
    {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        do
        {
            System.out.println("문자열을 입력하렴 : " );
            str =sc.nextLine();
            System.out.println(str);
        }while(!str.equals("exit"));
    }
}