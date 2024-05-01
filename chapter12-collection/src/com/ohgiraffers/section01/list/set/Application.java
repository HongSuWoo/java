package com.ohgiraffers.section01.list.set;

import java.util.HashSet;

public class Application
{
    public static void main(String[] args)
    {
        /*
        set 인터페이스를 구현한 set 컬렉션 클래스의 특징
            요소의 저장 순서를 유지하지 않는다.
            중복된 요소를 허용하지 않는다.
            단 하나의 null 요소만을 허용한다.

            HashSet
            set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
            jdk1.2 부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.

            Set 인터페이스를 구현한 대표적인 클래스로는 HashSet, TreeSet, LinkedHashSet 등이 있습니다.
         */


        HashSet<String> hset = new HashSet<>();
        hset.add("보통");
        hset.add("강사");
        hset.add("이상우");
        hset.add("이상우");

        System.out.println(hset);
        System.out.println(hset.contains("이상우"));
        System.out.println(hset.size());


        Object[] arr = hset.toArray();
        System.out.println(arr[1]);

        hset.clear();
        System.out.println(hset);
    }

}
