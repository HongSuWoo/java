package com.ohjiraffers.order.controller;

import com.ohjiraffers.order.dao.OrderRepository;
import com.ohjiraffers.order.dto.OrderDTO;
import com.ohjiraffers.order.service.OrderService;

import java.util.Scanner;

public class OrderController {
    Scanner sc = new Scanner(System.in);
    private OrderService orderService = new OrderService();
    private OrderRepository orderR = new OrderRepository();
    int sel;

    public String order(OrderDTO orderDTO)
    {
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        //System.out.println("컨트롤러 오더 실행");
        if(orderDTO.getMenuName().equals(""))
        {
            return "메뉴를 정해주세요";
        }

        if(orderDTO.getQuantity() <= 0)
        {
            return "수량을 입력해주세요";
        }
        // service 로직으로 넘김
        return orderService.order(orderDTO);
    }



    public  String orderDelete(int num)
    {
        if(num < 0)
            return "번호를 확인해주세요.";
        return orderService.orderDelete(num);
    }

    public String orderRead(){

        return orderService.orderprint();
    }

    public String orderDetail(int sel)
    {
        if(sel < 0)
            return "확인 하렴";
        int num=0;
        System.out.println("원하시는 정보를 입력 해주세요. \nex) 메뉴 가격 수량");
        String input = sc.nextLine();
        if(input.equals("메뉴"))
            num=1;
        else if(input.equals("가격"))
            num=2;
        else if(input.equals("수량"))
            num=3;
        else
            return "글자를 확인하여 다시 쳐주세요.";
        return orderService.orderdetail(sel,num);
    }
    public String orderModify(int sel)
    {
        if(sel < 0)
            return "번호를 확인하렴.";
        int num=0;
        System.out.println("수정을 원하시는 정보를 입력 해주세요. \nex) 메뉴 가격 수량");
        String input = sc.nextLine();
        if(input.equals("메뉴"))
            num=1;
        else if(input.equals("가격"))
            num=2;
        else if(input.equals("수량"))
            num=3;
        else
            return "글자를 확인하여 다시 쳐주세요.";
        System.out.println("덮어쓸 정보를 입력해주세요.");
        String input2 = sc.nextLine();

        return orderService.servicemodify(sel,num,input2);

    }

}