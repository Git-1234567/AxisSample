package SalaryCalculator;

public class Trainee extends employee{
    Trainee(long id,String name,String add,long phone,float salary)
    {
        super(id,name,add,phone);
        super.basicSalary=salary;
    }
    void calculateTransportAllowance()
    {
        double transport=10/100.0*basicSalary;
        System.out.println("TransportAllowance of trainee:"+transport);
    }
}
