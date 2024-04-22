package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class test
{
  public static void main(String[] args)
  {
      double avg = 0.0;
      Scanner sc = new Scanner(System.in);
      System.out.println("성적 여러개를 입력 해주세요.");
      String input = sc.nextLine();
      String[] score2 = input.split(" ");
      int[] score = new int[score2.length];
      System.out.println(score2.length + " 과목 의 수");
      for(int i=0; i<score2.length; i++)
      {
          avg += Integer.parseInt(score2[i]);
          score[i] = Integer.parseInt(score2[i]);
          System.out.print("제 "+ (int)(i+1) + " 과목 : " + score[i]+"점  ");
      }
         System.out.print("\n합계 : " + avg + "점    평계 : " + avg / score2.length+" 점");
  }
}
