package com.ohgiraffers.section03.branhing;

public class A_break
{
        /*
        brak문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break)
        기본 흐름에 대한 확인
         */
    public void testSimpleBreakStatement()
    {
        int i = 2;
        test:
        while(true)
            {
            if (i >= 10)
                break test;

            int x = 0;
            while (x <= 9)
                 {
                  if (x == 5)
                     break;
                  if (x == 0)
                    {
                        x++;
                        continue;
                    }
                  System.out.println(i + " * " + x + " = " + (i * x));
                  x++;
                }
                i++;
            }




    }




}
