package com.ohgiraffers.section01.list.map.run;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {


    /*
    Properties란?
    hashMap을 구현하여 사용 밥법 거의 유사하지만 key 와 value 모두 문자열만 사용할 수 있는 자료 구조이다.
    설정 파일의 값을 읽어서 어플리케이션에 적용할 대 사용한다.
     */

        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("dd", "dsdasda");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Properties prop2 = new Properties();
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.list(System.out);

            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}