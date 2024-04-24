package com.ohjiraffers.section04.constructor;

public class Application01
{
    public static void main(String[] args)
    {
        /*
        생성자란?
        인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고,
        인스턴스를 생성할 때 호출 한다.
        ㅅ행성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructior)
        기본 생성자는 complier에 의해 자동으로 추가되기 때문에 명시적으로 작성하지 안호고
        사용 할 수 있다.
        (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않는 것이다.
         */


        User song = new User("쏭",20,"010-2323-2323");
        User ssong = new User();

        System.out.println(song);





    }

}
