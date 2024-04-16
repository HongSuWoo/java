package main.java.com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args)
    {
        Application04 app=new Application04();
        System.out.println(app.myinfo("홍서우",99,'남',"010-9592-6660"));

    }
    public String myinfo(String name,int age,char gender,String number)
    {
        String result = name +  age  + gender  + number;
        return result;
    }


}
