package com.ohgiraffers.section01.statsment;

import com.ohgiraffers.common.JDBCTemplate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.*;
public class Application02
{
    public static void main(String[] args) throws SQLException {
        Connection con = getConnection();
        // 쿼리문을 저장하고 실행하는 기능을 하는 용도의 인터페이스
        Statement stmt = null;
        ResultSet rset= null;
        String name = "선동일";

        // select 결과 집합을 받아올 용도의 인터페이스
        //sql 은 sql 문법을 ㅛ잉혀 ㅣㄷ
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 을 입력하렴 - >");
        int empID = sc.nextInt();
        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("select EMP_ID, EMP_NAME from exployee where EMP_NAME = " + empID);
            while (rset.next())
                System.out.println(rset.getString("emp_id") + ", " + rset.getString("emp_namme"));

        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(con);
            close(rset);
            close(stmt);
        }






    }


}
