package com.ogiraffers.section04.comparison;

public class Application01
{
    public static void main(String[] args)
    {
        /*
        비교 연산자
        비교연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
         */
        /*
        비교 연산자의 종류
        '==' : 양쪽이 같으면 참 틀리면 거짓
        '!=' : 양쪽이 틀려야 참 같으면 거짓
        '>=' : 왼쪽이 크거나 같으면 참 아니면 거짓
         '>' : 왼쪽이 커야 참 아니면 거짓
        '<=' : 오른쪽이 크거나 같아야 참 아니면 거짓
         '<' : 오른쪽이 커야 참 아니면 거짓
         */
        int inum1 = 10;
        int inum2 = 20;
        System.out.println("=========정수 값 비교 ============");
        System.out.println("inum1과 inum2가 같은지 비교 : " +(inum1 == inum2));
        System.out.println("inum1과 inum2가 다른지 비교 : " +(inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " +(inum1 > inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " +(inum1 < inum2));
        System.out.println("inum1이 inum2와 같거나 큰지 비교 : " +(inum1 >= inum2));
        System.out.println("inum1이 inum2와 같거나 작은지 비교 : " +(inum1 <= inum2));


    }

}
