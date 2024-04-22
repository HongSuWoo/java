package com.ohgiraffers.section02.demansional;
import java.util.Scanner;
public class baduk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] pan= new int[19][19];
        int turn = 1;
        String input = new String();
        while(!input.equals("x"))
            {
                System.out.println("두실 좌표를 입력하세요. 종료를 하실려면 x: ");
                input=sc.nextLine();
                String[] input2 = input.split(" ");
                //입력부
                //입력절차가 틀린지 확인
                if (input2.length == 2)
                    {       //해당하는 좌표가 0이면 빈공간이지만 1또는 2의 경우 돌이 이미 있기때문에
                        if(pan[Integer.parseInt(input2[0])][Integer.parseInt(input2[1])] != 0)
                             {
                              System.out.println("이미 돌이 있습니다.");
                              }
                        else
                              {     //해당하는 공간에 이번턴 값이 흑돌 또는 백돌로 상태 값을 변경한다.
                                  pan[Integer.parseInt(input2[0])][Integer.parseInt(input2[1])]= turn;
                                  if (turn == 1)
                                      turn++;
                                  else
                                      turn--;
                              }
                     }
                else
                    System.out.println("입력을 확인해주세요");
                //출력부
                for(int i=0;i<pan.length;i++)
                {
                    for(int j=0;j<pan.length;j++)
                    {
                       if(pan[i][j]==0)
                            System.out.print("+ ");
                        else if(pan[i][j]==1)
                            System.out.print("● ");
                        else if(pan[i][j]==2)
                            System.out.print("○ ");
                    }
                    System.out.println();
                }
            }
    }

}
