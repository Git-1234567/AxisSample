package org.Bank.entities;

import java.time.LocalDate;

public class Bank_Cust {
    private int cust_id;
    private String cname;
    private String branch;
    private String phone;
    private LocalDate doj;
    public Bank_Cust(){
    }
    public int getCust_id() {
        return cust_id;
    }
    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public LocalDate getDoj() {
        return doj;
    }
    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }
    @Override
    public String toString() {
        return "Bank_Cust{" +
                "cust_id=" + cust_id +
                ", cname='" + cname + '\'' +
                ", branch='" + branch + '\'' +
                ", phone='" + phone + '\'' +
                ", doj=" + doj +
                '}';
    }
}
