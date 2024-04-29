package com.ohgiraffers.order.controller;

import com.ohgiraffers.dao.BookRepository;
import com.ohgiraffers.dto.BookDTO;
import com.ohgiraffers.service.OrderService;

import java.util.Scanner;

public class OrderController
{
    OrderService os = new OrderService();
    Scanner sc = new Scanner(System.in);
    String bookName,bookAuthor;
    int bookPrice,input;
    public String bookService()
    {
        int input;
        //도서 전체 열람
        System.out.println();
        System.out.println("-----도서 관리 메뉴-------");
        System.out.println("1. 도서 검색");
        System.out.println("2. 도서 등록");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 열람");
        System.out.print("원하시는 메뉴를 선택해주세요 -> ");
        input = sc.nextInt();
        sc.nextLine();
        switch (input)
        {
            case 1:
                break;
            case 2:
                System.out.println("도서 제목을 입력해주세요.");
                bookName = sc.nextLine();
                System.out.println("도서 저자를 입력해주세요.");
                bookAuthor = sc.nextLine();
                System.out.println("도서 가격을 입력해주세요.");
                bookPrice = sc.nextInt();
                if(bookPrice<=0)
                    {
                    System.out.println("가격 정보를 다시 확인해주세요.");
                    break;
                    }
                BookDTO bookDTO=new BookDTO(bookName,bookAuthor,bookPrice);
                return os.serviceRegist(bookDTO);
            case 3:
            case 4:
            case 5:
                System.out.println(os.serviceOverPrint());
                break;

            default :
                break;





        }
    return "0";
    }

    public String memberService()
    {



        return "";
    }



}
