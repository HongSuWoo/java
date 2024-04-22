package test;

import test.Database;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;




public class Counter
{
    private ArrayList<Customer> saram;
    private ArrayList<Bookadd> book;
    private BufferedReader input;
    public static void main(String[] args)
    {
        int number = 0;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. 도서 대여");
            System.out.println("2. 도서 반납");
            System.out.println("3. 도서 등록");
            System.out.println("4. 회원 등록");
            System.out.println("5. 도서 열람");
            System.out.println("6. 종    료");
            System.out.print("번호를 입력해 주세요. ->");
            number = sc.nextInt();
            sc.nextLine();
            switch(number)
            {
                case 1:

                case 2:

                case 3: addBook(number);

                case 4:

                case 5:

                default : System.out.println("정확히 입력해 주세요.");

            }



        }





    }

    public void addBook(int number)
    {
        System.out.print("제목 입력 : ");
        String name = input.readLine();
        int bookNum = number;
    }


}
