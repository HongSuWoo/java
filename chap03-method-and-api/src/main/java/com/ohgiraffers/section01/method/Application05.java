package main.java.com.ohgiraffers.section01.method;

public class Application05
{
    public static void main(String[] args)
    {
      int first = 100, second = 50;
      int max = Calculator.maxNumberof(first,second);
      System.out.println("최고값 : " + max);

      Calculator cal= new Calculator();
      int min = cal.minNumberof(first,second);
      System.out.println("최저값 : " + min);







    }




}
