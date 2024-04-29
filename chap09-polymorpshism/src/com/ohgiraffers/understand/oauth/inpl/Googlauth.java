package com.ohgiraffers.understand.oauth.inpl;

import com.ohgiraffers.understand.DTO.MemberDTO;
import com.ohgiraffers.understand.oauth.SnsAuth;

public class Googlauth implements SnsAuth
{


    @Override
    public boolean login(MemberDTO member) {
        System.out.println("구글 로그인 성공됨");
        return true;
    }
}
