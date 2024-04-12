package com.ohgiraffers.section02.variable;

public class Application02
{
    public static void main(String[] args)
    {
        // int 는 4byte from java
        // 자료형은 기본자료형(8형)과 참조 자료형 이 있다.

        //정수 자료형 4가지
        byte bnum=1;  // 1byte
        short snum=2; // 2byte
        int inum=3;   // 4byte
        long lunme=4; // 8byte
        //실수를 취급하는 자료형
        float fnum=0.3f; // 4byte
        double dnum=0.4; // 8byte
        //문자를 취급하는 자료형
        char ch='A';    // 2byte

        //논리형을 취급하는 자료형은 안가지
        boolean istrue=true; //1byte
                istrue=false;
        //참조 자료형
        //문자열을 취급하는 자료형
        String str="안녕하세요"; // 4byte
        /*
        System.out.println(bnum);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lunme);
        */
        System.out.println("bnum : " + bnum + "  snum : " + snum + "  inum : " + inum + "  lnumm : " + lunme);






    }




}
