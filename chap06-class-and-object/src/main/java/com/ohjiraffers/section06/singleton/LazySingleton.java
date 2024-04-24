package com.ohjiraffers.section06.singleton;

public class LazySingleton
{
    private static LazySingleton lazy;

    private LazySingleton()
    {
        System.out.println("Lazy 생성됨");

    }
    public static LazySingleton getInstance()
    {
       // System.out.println("레이지 호출");
        if(lazy == null) {
            lazy = new LazySingleton();
         //   System.out.println("Lazy 생성함");
        }
       //System.out.println("Lazy 반환함");
        return lazy;

    }

}
