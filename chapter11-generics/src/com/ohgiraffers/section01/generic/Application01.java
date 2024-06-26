package com.ohgiraffers.section01.generic;

public class Application01
{

    /*
    제네릭
    제네릭의 사전적인의미는 일반적ㅇ니 이라는 의미이다.
    자바에서 제네릭하면 데이터의 탕비으을 일반화한다다는 의미이다

    제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 알려준다
   컴파일러 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체ㅇㅢ 타입의 안정을 높일수 있으며
   잘못된 타입인 경우 컴파일러 에러를 발생시킨다
   반환값에 대한 타입 반환 및 타입 검사에 들어가는코드 생략이 가능해진다
   instanceof 비교 및 다운캐스팅 작성 불필요
   jdk 1.5버전부터 추가된 문법

   제네릭 프로그램
   데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입을 가질 수  있는 기술에 중점으 두어
   재사용을 높일 수 있는 프로그래밍 방식이다
     */
    public static void main(String[] args)
    {
        GenericTest<Integer> gt1 =new GenericTest();
        gt1.setValue(10);
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 =new GenericTest<>();
        gt2.setValue("오냐");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

    }

}
