package test;

import com.ohjiraffers.section01.user_type.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Book
{
    int num;
    String name;
    public Book(String name, int num)
    {
        this.num = num;
        this.name = name;
    }
       /*

       Scanner sc = new Scanner(System.in);
       //String[] data = new String[][];
       // ArrayList<String> data = new ArrayList<>();
       String data
       System.out.println("제목 을 입력 해주세요 : ");
       String name = sc.nextLine();
       data.add(num, name);
       System.out.println("Book Number : " +  num + "\nBook Name : " + data.get(num));
      /
        */
       public void toString(int num)
       {
           for(int i=0;i<num;i++)
             System.out.println("1 책번호 : " + i + "\n2 책 이름 : "+name);


       }
}

