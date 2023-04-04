package com.training.repositories;

import com.training.entities.Loan;
import com.training.util.DBCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoanManagementSystem {
    public int viewLoanCountBasedOnType(String loanType)
    {
        int count=0;
        ArrayList<Loan> list=new ArrayList<>();
        try{
            String query="select count(loanId) FROM loan where loanType=?";
            PreparedStatement ps= DBCon.con.prepareStatement(query);
            ps.setString(1,loanType);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                count = rs.getInt(1);
            }
        }catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        return count;
    }
}
