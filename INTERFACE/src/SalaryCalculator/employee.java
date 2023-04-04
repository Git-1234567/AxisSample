package SalaryCalculator;
public class employee {
    long employeeId,employeePhone;
    String employeeName,employeeAddress;
    double basicSalary,specialAllowance=250.80,hra=1000.50;
    float salary;
    employee(long id,String name,String add,long phone)
    {
        this.employeeId=id;
        this.employeeName=name;
        this.employeeAddress=add;
        this.employeePhone=phone;
    }
    void calculateSalary()
    {
        float salary;
        salary=(float)(basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100));
        System.out.println("salary of "+this.employeeName+":"+salary);
    }
    void calculateTransportAllowance()
    {
        double transport=10/100*basicSalary;
        System.out.println("TransportAllowance of employee:"+transport);
    }
}
