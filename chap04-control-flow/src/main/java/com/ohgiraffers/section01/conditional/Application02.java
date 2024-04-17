package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application02
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("수를 입력 하세요. ");
        int x = in.nextInt();
        System.out.println("수식를 입력 하세요. ex) + - * / ");
        char z = in.next().charAt(0);
        System.out.println("수를 입력 하세요. ");
        int y = in.nextInt();


        switch (z)
        {
            case '+' : System.out.println(x + y); break;
            case '-' : System.out.println(x - y); break;
            case '*' : System.out.println(x * y); break;
            case '/' : System.out.println(x / y); break;
            default: System.out.println("입력이 잘못 되었습니다.");
        }





    }

}
