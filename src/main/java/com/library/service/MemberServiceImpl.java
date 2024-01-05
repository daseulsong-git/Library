package com.library.service;

import com.library.domain.Member;
import com.library.persistence.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;
    public int signUp() {
        return 0;
    }
    public int signIn() {
        return 0;
    }

    // Check for duplicate ID
    public boolean checkDuplicate(String id) {
        Optional<Member> findMember = memberRepository.findById(id);
        if (!findMember.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
