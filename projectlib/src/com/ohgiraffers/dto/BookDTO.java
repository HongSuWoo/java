package com.ohgiraffers.dto;

import com.ohgiraffers.dao.BookRepository;

import java.awt.print.Book;

public class BookDTO
{
    private int bookNum;
    private String bookName; //1
    private String bookAuthor; //2
    private int bookPrice; //3
    private int bookStock;
    private String bookReser; //
    private int bookCount; //
    private String bookRent; //
    private int bookPeriod; //
    private int bookRentalCost;

    int bookRentCost;
    public BookDTO(String bookName, String bookAuthor, int bookPrice)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        if(this.bookPrice>=8000)
            this.bookPeriod =4;
        else
            this.bookPeriod =2;
        if(this.bookPrice>=8000)
            this.bookRentalCost =1000;
        else
            this.bookRentalCost =400;

    }



    public void setBookNum(int num) {

        this.bookNum = num;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock() {
        this.bookStock = 1;
    }

    public String getBookReser() {
        return bookReser;
    }

    public void setBookReser(String bookReser) {
        this.bookReser = bookReser;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getBookRent() {
        return bookRent;
    }

    public void setBookRent(String bookRent) {
        this.bookRent = bookRent;
    }

    public int getBookPeriod() {
        return bookPeriod;
    }



    public int getBookRentalCost() {
        return bookRentalCost;
    }



    @Override
    public String toString() {
        return "BookDTO[" +
                "bookNum=" + bookNum +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookStock=" + bookStock +
                ", bookReser='" + bookReser + '\'' +
                ", bookCount=" + bookCount +
                ", bookRent='" + bookRent + '\'' +
                ", bookPeriod=" + bookPeriod +
                ", bookRentalCost=" + bookRentalCost +
                "]\n";
    }
}
