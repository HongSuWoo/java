package com.ohjiraffers.order.dao;

import com.ohjiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository
{
    private final ArrayList<OrderDTO> orders = new ArrayList<>();
    String result ="";

    public String overPrint()
    {
        return this.orders.toString();
    }

    public String order(OrderDTO orderDTO)
    {
        int oldnum = this.orders.size();
        this.orders.add(orderDTO);
        System.out.println(oldnum);
        System.out.println(this.orders);
        if (oldnum >= this.orders.size())
            return "등록실패";
        return "등록성공";
    }
    public String detail(int num, int num2)
    {
        if (num < orders.size()) {
            OrderDTO order = (OrderDTO) orders.get(num);
            switch (num2) {
                case 1:
                    return order.getMenuName();
                case 2:
                    return String.valueOf(order.getPrice());
                case 3:
                    return String.valueOf(order.getQuantity());
                default:
                    return "잘못된 입력입니다.";
            }
        }
            else
                return "잘못된 입력입니다.";

    }

    public String deleteOrder(int num)
    {
        if (num < orders.size())
            orders.remove(num);
        return num+ " 번이 삭제 되었습니다.";
    }
    public String modify(int num, int num2,String data)
    {
        if (num < orders.size())
        {
            OrderDTO order = orders.get(num);
            switch (num2)
            {
                case 1:
                    order.setMenuName(data); break;
                case 2:
                    order.setprice(Integer.parseInt(data)); break;
                case 3:
                    order.setquantity(Integer.parseInt(data)); break;
                default:
                    return "잘못된 입력입니다.";
            }
            return order.toString()+" 로 수정 되었습니다.";
        }
        else
            return "잘못된 입력입니다.";


    }

}


