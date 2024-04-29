package com.ohgiraffers.service;

import com.ohgiraffers.dao.BookRepository;
import com.ohgiraffers.dto.BookDTO;

public class OrderService
{
    BookRepository br = new BookRepository();
    public String serviceRegist(BookDTO bookDTO)
    {
        return br.registerBook(bookDTO);
    }

    public String serviceOverPrint()
    {
        return br.overPrint();
    }


}
