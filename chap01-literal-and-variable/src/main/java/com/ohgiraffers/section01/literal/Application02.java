package com.ohgiraffers.section01.literal;

public class Application02
{
    public static void main(String[] args)
    {
        int a=2,b=2;
        double c=1.23, d=1.23;

      System.out.printf("%d + %d = %d   \n",a,b,a+b);
      System.out.printf("%d - %d = %d   \n",a,b,a-b);
      System.out.printf("%d / %d = %d   \n",a,b,a/b);
      System.out.printf("%d * %d = %d   \n",a,b,a*b);
      System.out.print("123 % 10 = ");
      System.out.println(123 % 10);

      System.out.println("      2차");

        System.out.printf("%.2f + %.2f = %.2f   \n",c,d,c+d);
        System.out.printf("%.2f - %.2f = %.2f   \n",c,d,c-d);
        System.out.printf("%.2f / %.2f = %.2f   \n",c,d,c/d);
        System.out.printf("%.2f * %.2f = %.2f   \n",c,d,c*d);
        System.out.print("1.23 % 1 = ");
        System.out.println(1.23%1.0);









    }
}
