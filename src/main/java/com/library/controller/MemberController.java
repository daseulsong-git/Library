package com.library.controller;

import com.library.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class MemberController {

    //회원 가입 POST
    @PostMapping("/signUp")
    public int signUp(){
        return 0;
    }

    @GetMapping("/signUpView")
    public void signUpView(){

    }

    @GetMapping("/logIn")
    //로그인 GET
    public int logIn(Member member){
        return 0;
    }

    @GetMapping("/signInView")
    public void signInView(){

    }

    @GetMapping("/logOut")
    public String logOut(SessionStatus status) {
        status.setComplete();
        return "redirect:/";
    }
}
