package com.ohgiraffers.section01.list.map.run;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class Appliation01
{
    public static void main(String[] args)
    {
        /*
         Map 인터페이스의 특징
         Collection 인터페이스와는 다른 저장 방식을 가진다.
         키(Key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다

         key(키)란?
         값(value)를 찾기 위한 이름 역활을 하는 객체를 의미한다.
         1. 요소의 저장 순서를 유지하지 않는다.
         2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장할 수 있따.

         hashMap, hashTable, treeMap 등의 대표적은 클래스가 있따.
         hashMap이 가장 많이 사용되며 HashTable은 jdk1.0부터 제공되며
         hashMap과 동일하게 동작한다. 하위 호환을 위해 남겨놓았기 때문에 가급적이면 hashamp을 사용하는 것이 좋다.
         */
        //hashMap jdk 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.

        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(12,"red apple");
        hmap.put(33,123);
        System.out.println(hmap);
        System.out.println(hmap.get(12));

        HashMap<Integer, String> imap2 = new HashMap<>();
        imap2.put(12,"red apple");
        imap2.put(33,"grape");
        imap2.put(12,"blue apple");
        System.out.println(imap2);
        System.out.println(imap2.get(12));

        Collection<String> values = imap2.values();


        System.out.println(values);

    }


}
