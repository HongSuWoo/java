package com.ohjiraffers;

import com.ohjiraffers.order.controller.OrderController;
import com.ohjiraffers.order.dao.OrderRepository;
import com.ohjiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        OrderRepository orderR = new OrderRepository();
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();
        boolean order = true;
        String result = "";
        String menu="";
        int price,quantity,num=0;

        while(order){

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.println("6. 종료");
            System.out.print("어떤 메뉴를 동작하시겠나요? ");
            int input = sc.nextInt();//input이라는 객체에 사용자가 정수로 입력할수 있게 설정함
            //int형 변수 input으로 이름을 지정하고 int타입으로 사용자가 입력하게 설정
            sc.nextLine();


            switch (input)
            {//switch 객체에 input 변수에 들어갈 사용자가  주문할 부분을 다양하게 case별로실행
                case 1 : // 주문등록
                    System.out.print("주문할 메뉴 이름들 을 등록해주세요 : ");
                    menu =sc.nextLine();
                    System.out.println("수량들 을 입력해주세요 :");
                    menu += "m " + sc.nextLine();
                    System.out.println("가격들 을 입력해주세요 : ");
                    menu += "n " + sc.nextLine();
                    orderController.controllerInput(menu);
                    //OrderDTO orderDTO = new OrderDTO(menu,price,quantity);
                   // orderController.order(orderDTO);
                    break;
                case 2 : // 주문삭제
                    System.out.println("삭제 하실 번호를 입력해주세요.");
                    num = sc.nextInt();
                    System.out.println(orderController.orderDelete(num));
                    break;
                case 3 : // 주문 수정
                    System.out.println("수정 하실 번호를 입력해주세여.");
                    num = sc.nextInt();
                    System.out.println(orderController.orderModify(num));
                    break;
                case 4 : // 주문 상세조회
                    System.out.println("조회 하실 번호를 입력해주세요.");
                    num=sc.nextInt();
                    System.out.println(orderController.orderDetail(num));
                    break;
                case 5 :// 주문 전체조회
                    System.out.println("전체조회 결과 입니다.");
                    System.out.println(orderController.orderRead());
                    break;
                case 6:
                    order = false;
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }


           // System.out.println(result);

//            System.out.print("주문을 종료하시겠나요?");
//            order = sc.nextBoolean();
        }
    }
}