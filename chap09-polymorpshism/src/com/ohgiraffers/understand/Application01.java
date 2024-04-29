package com.ohgiraffers.understand;

import com.ohgiraffers.understand.DTO.MemberDTO;
import com.ohgiraffers.understand.oauth.inpl.Googlauth;
import com.ohgiraffers.understand.oauth.inpl.Kakaoauth;
import com.ohgiraffers.understand.oauth.inpl.Naverauth;
import com.ohgiraffers.understand.service.MemberService;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Application01
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        MemberService memberService;
        do {
            Member member;
            System.out.println("-----로그인 프로그램 시작");
            System.out.println("1. google 로그인");
            System.out.println("2. naver 로그인");
            System.out.println("3. 카카오 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.println("로그인 한 인증 수단을 선택해주세요.");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println("아이디를 입력해주세요");
            String id = sc.nextLine();
            System.out.println("비밀번호를 입력해주세요.");
            String pwd = sc.nextLine();
            MemberDTO memberDTO = new MemberDTO(id, pwd);
            String result ="";
            switch (choice)
            {
                case 1: memberService = new MemberService(new Googlauth());
                        result = memberService.loginMember(memberDTO);
                        break;
                case 2: memberService = new MemberService(new Naverauth());
                        result = memberService.loginMember(memberDTO);
                        break;
                case 3: memberService = new MemberService(new Kakaoauth());
                        result = memberService.loginMember(memberDTO);
                        break;
                default: result = "로그인 실패";
                        break;
            }
            System.out.println(result);
        }while(true);

    }

}
