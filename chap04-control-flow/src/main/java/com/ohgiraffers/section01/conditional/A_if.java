package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if
{
    public void testSimpleIfStatement()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("값을 입력해주세요: ");
    int num = sc.nextInt();
    if(num == 0 )
            System.out.println(num +" 은 0 입니다. with if");
    else if(num % 2 == 0)
            System.out.println(num +" 은 2의 배수 입니다. with else if");
    else
           System.out.println(num +"은 2의 배수 가 아닙니다. with else");
    }

//
  /* 1. calculator 메서드를 만든다.
     2. 두 수를 입력 받는다.
     3. 연산기호를 입력 받는다.
     4. 연산기호를 확인함.
     5. 연산을 진행 한다.
     6. 반환한다
  */
}
