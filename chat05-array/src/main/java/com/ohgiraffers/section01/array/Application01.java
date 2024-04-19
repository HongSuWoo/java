package com.ohgiraffers.section01.array;

public class Application01
{
    public static void main(String[] args)
    {
        /*
         배열 이란?
         동일한 자료형의 묶음(연속된 메모리 공산에 값을 저장하고 사용하기 위한 용도) 이다.
         배열은 힙영역에 new연산자를 이용하여 할당한다.
         */

        /*
        배열의 사용 이유
        만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.\
        1. 연속된 메모리 공간을 관리할 수 없다.
        2. 반복문을 이용한 연속 처리가 불가능하다.
         */
        String bread1 = "식빵";
        String bread2 = "식빵";
        String bread3 = "식빵";
        String bread4 = "식빵";
        String bread5 = "식빵";
        String bread6 = "식빵";
        String bread7 = "식빵";
        String bread8 = "식빵";
        String bread9 = "식빵";

        String[] breads = new String[10];
        for (int i = 0; i < 10;i++)
        {
            breads[i] = "식빵";
        //    System.out.println(breads[i]);
        }

        int[] iarr= new int[5];
        char carr[]=new char[10];

        iarr[2]=10;
        System.out.println(iarr[2]);
        //iarr 을 출력 할경우 해당위치의 주소 값이 나온다. 왜냐하면 iarr[]은 배열로 되어있기 때문에 iarr의 인덱스를 지정하지 않으면 iarr의
        //맨 해당변수의 첫번째 주소값이 나온다. 이 주소값에 null값을 넣어버리면 해당변수는 의 주소가 초기화가 되기때문에 데이터가 비어버린다.
        iarr = null;
        System.out.println(iarr);
        iarr[0] = 10;
        System.out.println(iarr[0]);

        int result = 100;

        int newArray[] = new int[result];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=10;

        }
    }
}
