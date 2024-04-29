package com.ohgiraffers.dao;

import com.ohgiraffers.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookRepository
{
    private final ArrayList<BookDTO> bookDB = new ArrayList<>();
    String result ="";
    public String registerBook(BookDTO bookDTO)
    {
        int oldnum = this.bookDB.size();


        this.bookDB.add(bookDTO);
        System.out.println(oldnum);
        System.out.println(this.bookDB);
        if (oldnum >= this.bookDB.size())
            return "등록실패";
        BookDTO book2;
        book2 = bookDB.get(oldnum);
        book2.setBookNum(oldnum);
        return "등록성공";
    }



    public String overPrint()
    {
        return this.bookDB.toString();
    }



}
