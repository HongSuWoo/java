package com.ohgiraffers.section01.statsment;

import com.mysql.cj.conf.PropertySet;
import com.ohgiraffers.common.JDBCTemplate.*;
import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.*;

public class Application04
{
    public static void main(String[] args)
    {
        Connection con = getConnection();

        Statement stmt = null;
        ResultSet rsmt = null;

        Scanner sc = new Scanner(System.in);
        String query = "SELECT * FROM employee";
        // 사원정보를 저장하기 위한
        ArrayList<EmployeeDTO> employees = new ArrayList<>();


        try {
            stmt= con.createStatement();
            rsmt= stmt.executeQuery(query);
            while(rsmt.next())
            {
                EmployeeDTO employeeDTO = new EmployeeDTO();
                employeeDTO = new EmployeeDTO();
                employeeDTO.setEmpId(rsmt.getString("EMP_ID"));
                employeeDTO.setEmpName(rsmt.getString("EMP_NAME"));
                employeeDTO.setEmpNo(rsmt.getString("EMP_NO"));
                employeeDTO.setBonus(rsmt.getDouble("BONUS"));
                employeeDTO.setSalary(rsmt.getInt("SALARY"));
                employeeDTO.setDeptCode(rsmt.getString("DEPT_CODE"));
                employeeDTO.setEntDate(rsmt.getDate("ENT_DATE"));
                employeeDTO.setEntYn(rsmt.getString("ENT_YN"));
                employeeDTO.setHireDate(rsmt.getDate("HIRE_DATE"));
                employeeDTO.setJobCode(rsmt.getString("JOB_CODE"));
                employeeDTO.setEmail(rsmt.getString("EMAIL"));
                employeeDTO.setPhone(rsmt.getString("PHONE"));
                employeeDTO.setManagerId(rsmt.getString("MANAGER_ID"));
                employeeDTO.setSalLevel(rsmt.getString("SAL_LEVEL"));
                employees.add(employeeDTO);
            }
            } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            close(rsmt);
            close(stmt);
            close(con);

        }
        System.out.println(employees);
    }

}



