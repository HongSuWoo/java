package main.java.com.ohgiraffers.section01.method;

public class Application01
{
    public static void main(String[] args)
    {
      /*
      메소드 란
      메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
       */
       System.out.println("main() 시작됨......");
       //사용자 정의형. call by reference?
       Application01 app1 = new Application01();
       app1.methodA();
       System.out.println("main() 종료됨.....");
    }

    public void methodA()
    {

        System.out.println("methodA()를 시작함");
        methodB();
        System.out.println("methodA()를 종료됨");
    }
    public void methodB()
    {
        System.out.println("methodB()를 시작함");
        methodC();
        System.out.println("methodB()를 종료됨");

    }
    public void methodC()
{
    System.out.println("methodC()를 시작함");
    System.out.println("methodC()를 종료됨");

}




}
