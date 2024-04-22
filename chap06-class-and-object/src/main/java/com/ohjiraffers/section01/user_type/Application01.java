package com.ohjiraffers.section01.user_type;

public class Application01
{
    public static void main(String[] args)
    {
        String id = "정한1";
        String pwd = "pass01";
        String name = "황정한";
        int age = 20;
        char  gender = 'm';
        String[] hobby = new String[]{"축구", "헬스", "런닝"};

        String id2 = "재희1";
        String pwd2 = "pass02";
        String name2 = "송재희";
        int age2 = 20;
        char  gender2 = 'f';
        String[] hobby2 = new String[]{"걷기" , "릴스시청", "인사동"};

        //---------------------------------------

        Member hwang = new Member();
        hwang.id = "정한";
        hwang.name = "황정한";
        hwang.pwd = "pass01";
        hwang.age = 20;
        hwang.gender = 'm';
        hwang.hobby = new String[]{"축구","헬스","런닝"};

        Member song = new Member();
        song.id = "재희";
        song.name = "송재희";
        song.pwd = "pass01";
        song.age = 22;
        song.gender = 'f';
        song.hobby = new String[]{"걷기","릴스","인사"};

        System.out.println("\n이야이야호" + hwang);







    }
}
