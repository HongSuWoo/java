package com.ohgiraffers.understand.service;

import com.ohgiraffers.understand.DTO.MemberDTO;
import com.ohgiraffers.understand.oauth.SnsAuth;

public class MemberService
{
    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth)
    {
        this.snsAuth = snsAuth;
    }

    public String loginMember(MemberDTO member)
    {
        boolean result = snsAuth.login(member);
        String type = String.valueOf(snsAuth.getClass()).split("impl.")[0];

        return type + "  으로 로그인  " + result ;

    }

}











//야이야이야 이렇게 도 살아가고 이렇게 또 눈물 흘리고
//야이야이하
/*
아버지 이제야 깨달아요
어찌 그렇게 사셧나요
더이상 쓸쓸해 하지마요
이제 나와 같이 가요
여보 어느새
 */