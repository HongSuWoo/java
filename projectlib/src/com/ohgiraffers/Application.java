package com.ohgiraffers;

//뭐야 이건 젠장
import com.ohgiraffers.order.controller.OrderController;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OrderController oc = new OrderController();
        int input;
        do
        {
                System.out.println("1. 대출/반납/연장/예약");
                System.out.println("2. 회원관리");
                System.out.println("3. 도서관리");
                System.out.println("4. 데이터 관리");
                System.out.println("5. 로그인");
                System.out.println("6. 로그아웃");
                System.out.println("7. 종   료");
                System.out.print("메뉴를 선택해 주세요. -> ");

                input = sc.nextInt();
                sc.nextLine();
                switch (input)
                {
                    case 1:

                    break;
                    case 2: oc.memberService();

                    break;
                    case 3: oc.bookService();

                    break;
                    case 4:

                    break;
                    case 5:

                    break;
                    case 6:

                    break;
                    case 7:

                    break;
                    default :
                    break;

                }


        }while(true);



    }





}
