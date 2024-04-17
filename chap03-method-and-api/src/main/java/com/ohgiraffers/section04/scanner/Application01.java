package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01
{
    public static void main(String[] args)
    {
        Application01 app = new Application01();
        String str = app.inputInfo();
        System.out.print(str);
    }
    public String inputInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("당신의 키를 입력하세요 : ");
        Double key = sc.nextDouble();
        System.out.print("당신의 성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("당신의 나이를 입력하세요 : ");
        int age = sc.nextInt();
        String result = " 이름 : " + name + " 키 : " + key + " 성별 : " + gender + " 나이 : " + age;
        return result;
    }



}
