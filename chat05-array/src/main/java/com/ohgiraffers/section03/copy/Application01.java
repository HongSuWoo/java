package com.ohgiraffers.section03.copy;

public class Application01
{
    public static void main(String[] args)
    {
        String[] goldSideName = {"김재석", "송재희", "황정한"};
        String[] names = goldSideName;
        System.out.println(goldSideName);
        System.out.println(names);

        goldSideName[0] ="김효주";
        System.out.println(goldSideName);
        System.out.println(names);





    }
}
