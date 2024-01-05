package com.library.service;

import com.library.domain.Member;

public interface MemberService {
    int signUp();
    int signIn();
    boolean checkDuplicate(String id);
}
