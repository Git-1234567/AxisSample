package org.example;

import com.training.repositories.LoanManagementSystem;
import com.training.util.DBCon;

import java.sql.SQLException;
import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        DBCon.getConnection();
        LoanManagementSystem lms=new LoanManagementSystem();
        while (true)
        {
            System.out.println("Enter the type of loan to be searched");
            String loanType=sc.next();
            int count=lms.viewLoanCountBasedOnType(loanType);
            if(count>0)
            {
                System.out.println(String.format("Number of customers who have taken %s loan: %d",loanType,count));
            }else {
                System.out.println(String.format("No customer has acquired %s loan",loanType));
            }
            System.out.println("Do you want to search again the loan type(yes/no)");
            String input=sc.next();
            if(input.equalsIgnoreCase("no"))
            {
                System.out.println("Thank you for using the Application");
                break;
            }
        }
    }
}
