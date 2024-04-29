package com.ohgiraffers.section02.abstractclass;

public class Application01
{
    public static void main(String[] args)
    {   /*
            츠상클래스와 추상 메소드
            추상메소드를 6개이상 포함하는 클래스를 추상 클래스 라고한다.
            추상클래스는 인서튼서를 생성할 수 없다.
            츠상클래스를 사용할려면 추상클ㄹ래스를 상속받은 하위 클래스를 이요애서 인스턴스를 생ㅅㅇ 해야 한다.
            이 때 추상클래스는 상위타입으로 사용 될 수있으며, 다형성을 이용할 수 있다.

            추상클래스에 작성한 추상메소드는 반드시 후손이 오버라이딩 해서 작성해야 하며,
            후손클래스들의 메소드들의 공통 인터페이스로의 역활을 수행할 수 있따.
            추상클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메소드는 다형성이 적용되어
            동적바인딩에 의해 다양한 응답을 할 수 있게 된다.

            추상클래스를 상속받아 수현할 때는 extaends 키워드를 사용하며
            자바에선,ㄴ extends로 클래스를 상속받을 시 하나의 부모 클래스로만 가질 수 있다. (단일 상속)

            추상메소드란
            메소드의 선언부만 있고 구현부가 없는ㅁ ㅔ소드를 추상 메소드라고 한다.
            public abstract class
        */

       // Product pro  = new Product();
       // Product pro  = new Product(); 추상클래스는 인스턴스 생성 불가/

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.printSmartPhone();
        smartPhone.absMethod();

        System.out.println("--------------------------------");
//        Product pro2 = new Product() {
//            @Override
//            public void absMethod() {
//
//            }
////        }
//        pro2.absMethod();
//        pro2.nonStaticMethod();
//        Product pro= new SmartPhone();
//        pro.absMethod();
//        pro.nonStaticMethod();

    }
}
