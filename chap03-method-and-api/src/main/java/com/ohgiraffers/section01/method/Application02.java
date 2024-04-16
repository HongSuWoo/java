package main.java.com.ohgiraffers.section01.method;

public class Application02
{

    public static void main(String[] args)
    {
        int a=2,b=2,sum;
      Application02 app1 = new Application02();

      sum = app1.add(a,b);
      System.out.println(sum);

    }

public int add(int x,int y)
{
    return x+y;
}


}
