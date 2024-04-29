package com.ohgiraffers.section01.polymorphim;

public class Mullok extends Animal
{
    @Override
    public void eat() {
        System.out.println("멀록은 물고기를 먹어요.");
    }

    @Override
    public void run()
    {
        System.out.println("멀록 달린다.");
    }

    @Override
    public void cry()
    {
        System.out.println("아오오오로오로오로호오로오로오로어ㅗ로ㅗ올오로ㅓ오호호옹로홍ㅎ롱로옿옹롱호옿올오롷옿");
    }
    public void attack()
    {
        System.out.println("강사님을 멤매 합니다.");
    }
}
