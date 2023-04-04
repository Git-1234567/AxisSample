package org.example;

import org.Bank.entities.Bank_Cust;
import org.Bank.repositories.Cust_DAO;
import org.Bank.util.DBCon;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws SQLException {
        DBCon.getConnection();
        Cust_DAO cust=new Cust_DAO();
        ArrayList<Bank_Cust> custlist=cust.getAllCust();
        System.out.println(custlist);
    }
}