package com.ohgiraffers.section01.conditional;
// D_switch 라는 클래스를 모두가 사용할 수 있도록 만든다.
import java.util.Scanner;
public class D_switch
{   //D_switch 의 시작
    //클래스 내부 속성
    //testSimpleSwitchStatement의 종료
    public double switchCalculator()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("수를 입력 하세요. ");
        int x = in.nextInt();
        System.out.println("수식를 입력 하세요. ex) + - * / ");
        char z = in.next().charAt(0);
        System.out.println("수를 입력 하세요. ");
        int y = in.nextInt();
        double result = 0.0;
        switch (z)
        {
            case '+' : result=(x + y); break;
            case '-' : result=(x - y); break;
            case '*' : result=(x * y); break;
            case '/' : result=(x / y); break;
            default: System.out.println("연산불가"); break;
        }
        return result;
    }
    public void ifGrade(int x)
    {
        String grade="";
        if(x > 100 || x < 0)
            System.out.println("잘못된 입력 입니다.");
        else if(x == 100)
            grade = "a+";
        else if (x >= 90)
            grade = "a";
        else if (x >= 85)
            grade = "b+";
        else if (x >= 75)
            grade = "b";
        else if (x >= 60)
            grade = "c";
        else if (x > 0)
            grade = "d";
        else
            System.out.println("대체 뭘 넣었냐");

        System.out.println("당신의 등급은 "+ grade + " 입니다.");
    }
} //D_switch 의 종료
