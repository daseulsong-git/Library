package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

    //도서 검색 GET
    @GetMapping("/searchBooks")
    public String searchBooks(String keyword, Model model){
        return "booksearch";
    }

    //도서 상세 조회 GET
    @GetMapping("/searchBookDetail")
    public String searchBookDetail(String bookId, Model model){
        return "bookdetail";
    }
}
