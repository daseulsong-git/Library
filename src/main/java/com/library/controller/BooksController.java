package com.library.controller;

import com.library.domain.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {

    //도서 검색 GET
    @GetMapping("/searchBooks")
    public List<Books> searchBooks(String keyword){
        return null;
    }

    //도서 상세 조회 GET
    @GetMapping("/searchBookDetail")
    public Books searchBookDetail(String bookId, Model model){
        return null;
    }
}
