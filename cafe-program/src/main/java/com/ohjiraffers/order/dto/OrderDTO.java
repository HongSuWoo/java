package com.ohjiraffers.order.dto;

public class OrderDTO {
    private String menuName;
    private int price;
    private int quantity;

    //public OrderDTO() {}
    public OrderDTO(String menu, int price, int quantity)
    {
        this.menuName = menu;
        this.price = price;
        this.quantity = quantity;
    }


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setquantity(int quantity) {this.quantity = quantity;    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }



    @Override
    public String toString() {
        return "OrderDTO[" + "메뉴='" + menuName + ", 수량=" + quantity + ", 가격=" + price + ",  합계 가격 = " + price*quantity + "]";
    }
}