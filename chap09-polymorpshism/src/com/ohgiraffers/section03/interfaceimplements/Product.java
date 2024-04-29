package com.ohgiraffers.section03.interfaceimplements;
/*
extends 상속
 */
public class Product extends Object implements InterProduct
{
    /*
        클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
        또한 인터페이스는 여러 개를 상속받을 수 있으며,
        extends 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능하다.
        단, extends 키워드를 앞에 작성하고 implements 를 뒤에 작성한다(순서 변경시 에러가 발생함)

     */


//
//    @Override static 메소드 또한 프로그램이 로드 될때 메모리에 할당되기 떄문에 재정의가 불가능하다.
//    public static void statiMethod()
//    {
//        System.out.println("인터프로덕트클래스의 스테틱 메소드 호출");
//    }
    //default 키워드를 사용하면 논스테틱 메소드도 작성이 가능하다 jdk 1.8추가
//    @Override 재정의가 불가능하다 오직 인터페이스에서만 작동 가능
//    public default void defaultMethod()
//    {
//        System.out.println("인터프로덕트클래스의 디펄트 메소드 호출..");
//
//    }

    @Override
    public void nonStaticMethod()
    {
        System.out.println("interProduct의 nonstaticMethod 오버라이딩한 메소드 호출됨.");
    }

    @Override
    public void absMethod()
    {
        System.out.println("interProduct의 absMethod 오버라이딩한 메소드 호출됨");
    }
}
