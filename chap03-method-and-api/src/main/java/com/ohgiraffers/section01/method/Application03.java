package main.java.com.ohgiraffers.section01.method;

public class Application03 {

    public static void main(String[] args)
    {
        String name = "홍서우";
        int age = 99;
        char gender = '남';
        String number = "010-9592-6660";
        String sum;
        Application03 app=new Application03();
        sum=app.myinfo(name,age,gender,number);
        System.out.println(sum);
    }
    public String myinfo(String name,int age,char gender,String number)
    {
        String result = name + " " + age + " " + gender + " " + number;
        return result;
    }


}
