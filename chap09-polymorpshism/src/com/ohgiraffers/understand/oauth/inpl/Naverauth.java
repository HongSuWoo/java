package com.ohgiraffers.understand.oauth.inpl;

import com.ohgiraffers.understand.DTO.MemberDTO;
import com.ohgiraffers.understand.oauth.SnsAuth;

public class Naverauth implements SnsAuth
{
    @Override
    public boolean login(MemberDTO member)
    {
        System.out.println("네이버 로그인 됨");
        return true;
    }
}
