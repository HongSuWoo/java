package com.ohgiraffers.section01.conditional;
//현재 내 경로

import java.util.Scanner;

public class Application06 // 개나소나 쓸수있는 클래스 어플6
{ //클래스 어플이 6의 시작
    public static void main(String[] args) // 스태틱영역에 개나소나 쓸수있는 반환값이 없는 메인을 올림.
    // 스태틱영역이란 프로그램 시작시 바로 사용 할 수 있는 메모리의 영역을 뜻함. 그래서 main의 경우는 반드시 스테틱에 올려 주어야 한다
    //왜냐하면 자바코드의 시작은 main에서 시작되기때문에 다른곳에 있을경우 시작자체가 불가능하다. 왜냐 호출자체를 할수있는 영역자체가 없기 때문에.

    {//메인의 시작
      D_switch dSwitch = new D_switch();
      //내 경로안에 있는 D_swtich 란놈을 dSwitch란 변수명으로 선언. 변수명 선언과 양식이 비슷함
      // dSwitch 안에 = 객체로 만든 D_switch();를 넣고 변수명을 지정해줌으로서 메모리에 할당함.
        Scanner in = new Scanner(System.in);
        System.out.println("성적 점수를 입력해주세요. : ");
        int x = in.nextInt();
        dSwitch.ifGrade(x);
        System.out.println(dSwitch.switchCalculator());


    }//메인의 종료
}//클래스 어플6의 종료
