package com.ohjiraffers.order.service;

import com.ohjiraffers.order.dao.OrderRepository;
import com.ohjiraffers.order.dto.OrderDTO;


public class OrderService {

    private OrderRepository orderRepository = new OrderRepository();

    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.
    public String order(OrderDTO orderDTO){
        if(!orderDTO.getMenuName().equals("아"))
            return "주문 실패";

        if(orderDTO.getPrice() <= 0){
            return "땅파서 장사하냐?";
        }


        return orderRepository.order(orderDTO);
    }

    public String orderprint()
    {
        return orderRepository.overPrint();
    }
    public String orderdetail(int num,int num2)
    {
        return orderRepository.detail(num,num2);
    }
    public String orderDelete(int num)
    {
        return orderRepository.deleteOrder(num);
    }
    public String servicemodify(int num,int num2,String data)
    {
        return orderRepository.modify(num,num2,data);
    }

}