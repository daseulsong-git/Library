package com.library.controller;

import com.library.domain.Member;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("member")
public class MemberController {

    @Autowired
    private MemberService memberService;
    @GetMapping("/signUpView")
    public String signUpView(){
        return "signUp";
    }
    @PostMapping("/signUp")
    public String signUp(Member member, RedirectAttributes redirectAttributes){
        return "booksearch";
    }
    @GetMapping("/checkDuplicate")
    public String checkDuplicate(@RequestParam("id") String id, Model model){
        //boolean duplicateResult = memberService.checkDuplicate(id);

//        boolean duplicateResult = true;
//        if (duplicateResult) {
//            return "true"; // 중복된 경우
//        } else {
//            return "false"; // 중복되지 않은 경우
//        }
        model.addAttribute("duplicateResult",true);
        return "signUpView";
    }

    @GetMapping("/logIn")
    public String logIn(Member member){
        return "rentallist";
    }
    @GetMapping("/logInView")
    public String logInView(){
        return "index.html";
    }
    @GetMapping("/logOut")
    public String logOut(SessionStatus status) {
        status.setComplete();
        return "redirect:/";
    }
}
