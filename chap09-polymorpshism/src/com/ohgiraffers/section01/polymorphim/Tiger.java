package com.ohgiraffers.section01.polymorphim;

public class Tiger extends Animal
{
    @Override
    public void eat() {
        System.out.println("호랑이가 냠냠");
    }

    @Override
    public void run() {
        System.out.println("호랭이는 기어댕겨요.");
    }

    @Override
    public void cry() {
        System.out.println("호랭이가 야옹");
    }

    public void bite() {

        System.out.println("호랭이가 문다!");
    }




}
