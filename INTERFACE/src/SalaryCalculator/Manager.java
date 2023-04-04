package SalaryCalculator;

public class Manager extends employee{
    Manager(long id,String name,String add,long phone,float salary)
    {
        super(id,name,add,phone);
        super.basicSalary=salary;
    }
    @Override
    void calculateTransportAllowance() {
        double transport=15*basicSalary/100;
        System.out.println("TransportAllowance of manager:"+transport);
    }
}
