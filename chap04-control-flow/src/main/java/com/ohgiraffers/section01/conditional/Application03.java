package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application03
{
    public static void main(String[] args)
    {
        Application03 app = new Application03();
        String Doo = app.calculator();
        System.out.println(Doo);
    }

    public String calculator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the first number: ");
        int second = sc.nextInt();
        System.out.println("Enter the first number: 3");
        char operator = sc.nextLine().charAt(0);
        double result;
        if(operator == '+')
            result = first + second;
        else if (operator == '-')
            result = first - second;
        else if (operator == '*')
            result = first * second;
        else if (operator == '/')
            result = first / second;
        else
            return "연산식 오류";

        return String.valueOf(result);
    }

}

