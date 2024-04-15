package com.ogiraffers.section02.assignment;

public class Application01
{
    public static void main(String[] args)
    {
     int num1 = 10;
     int num2 = 10;
      //  num2 = num1 + num2;

     /*
     대입연산자
     '=' : 왼쪽의 피연산자에 오른쪽 피연산자를 대입함
     '+= : 왼쪽의 피연산자에 오른쪽 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
     '-= : 왼쪽의 피연산자에 오른쪽 피연산자를  뺀  결과를 왼쪽의 피연산자에 대입함
     '*= : 왼쪽의 피연산자에 오른쪽 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
     '/= : 왼쪽의 피연산자에 오른쪽 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
     '%= : 왼쪽의 피연산자에 오른쪽 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함

      */

     num2 += num1;
     System.out.println(num2);


    }
}
