package com.ohgiraffers.understand.oauth.inpl;

import com.ohgiraffers.understand.DTO.MemberDTO;
import com.ohgiraffers.understand.oauth.SnsAuth;

public class Kakaoauth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member)
    {
        System.out.println("카카오 로그인 성공");
        return true;
    }
}
