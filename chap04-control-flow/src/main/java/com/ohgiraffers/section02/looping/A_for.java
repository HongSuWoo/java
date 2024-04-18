package com.ohgiraffers.section02.looping;

public class A_for
{
    public void testSimpleForStatement()
    {
       /*
       for문 표현식
       for(초기식;조건식;증감식){
       조건식이 참인 경우 실해알 구문 == 반복할 구문
        */
        for(int i=0;i<=10;i++)
            for(int x=0;x<=10;x++)
                System.out.println(("만원 : " + i +" 천원 :" + x));
    }

    public void tree()
    {
        int a=7;
        for(int i=1;i<=a;i++)
        {   for(int y=i;y<=a;y++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println("");
        }


    }
    public void treeTwo()
    {
        for (int i = 1; i <= 7; i++) {
            for (int y = i; y <= 7; y++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public void treeThree()
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int y = i; y <= 7; y++)
                System.out.print("*");
            System.out.println("");
        }


    }
    public void treebase()
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int y = 1; y <= i; y++)
                System.out.print("*");
            System.out.println("");
        }


    }
    public void gugudan()
    {
        for (int i = 2; i <= 9; i++)
        {
            for (int y = 2; y <= 9; y++)
                System.out.printf("%d * %d = %2d  ", y, i, i * y);
            System.out.println("");
        }
    }

    public void gugudanTwo()
    {   int i = 2;
        for (int j = i; j <= 9; j++)
        {    // 7 % 2 == 0
            if(j % i == 0 )
            for (int y = 1; y <= 9; y++)
            {
                System.out.println(j + "*" + y + "=" + j * y); // 2 * 3 = 6
            }
        }
    }




}






