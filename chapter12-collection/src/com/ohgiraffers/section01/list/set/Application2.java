package com.ohgiraffers.section01.list.set;

import java.util.LinkedHashSet;

public class Application2
{
    public static void main(String[] args)
    {   /*
        LinkedHashSet
        hashSet이 가지는 기능을 모두 가지고 있고
        추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
       */
    LinkedHashSet<String> lhSet = new LinkedHashSet<>();

        lhSet.add("자바");
        lhSet.add("오라클");
        lhSet.add("출력");
        lhSet.add("시플플");
        lhSet.add("html");
        lhSet.add("jtbc");

        System.out.println(lhSet);




    }


}
