package org.Bank.repositories;

import org.Bank.entities.Bank_Cust;
import org.Bank.util.DBCon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Cust_DAO {
    public ArrayList<Bank_Cust> getAllCust()
    {
        ArrayList<Bank_Cust> custlist=new ArrayList<>();
        ResultSet rs;
        Bank_Cust bc=new Bank_Cust();
        try{
            Statement st= DBCon.con.createStatement();
            rs= st.executeQuery("select * from customer");
            System.out.println(rs.next());
            while(rs.next())
            {
                int id=rs.getInt(1);
                String cname= rs.getString(2);
                String br=rs.getString(3);
                String phone= rs.getString(4);
                Date date=rs.getDate(5);
                LocalDate ld= ((java.sql.Date) date).toLocalDate();
                bc=new Bank_Cust();
                custlist.add(bc);
            }
        }catch(SQLException se)
        {
            throw new RuntimeException(se);
        }
        return custlist;
    }
}
