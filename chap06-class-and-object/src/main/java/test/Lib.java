/*
package test;

import com.ohjiraffers.section01.user_type.Member;

import java.util.Scanner;

public class Lib
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int input=0;
        int num = 0;

       do {
           System.out.println("1 : 책 대여\n2 : 책 반납 \n3 : 책 등록\n4 : 책 열람 \n5 : 종  료");
           input = sc.nextInt();
           sc.nextLine();
           switch (input) {
               case 3:
                  System.out.println("제목을 입력해주세요. : ");
                  String name = sc.nextLine();
                   Book Book = new Book(name,num);
                  num++;
                  break;
               case 4:
                   Book.toString(num);
                   break;

           }


       }while(input != 5);

    }
}
*/