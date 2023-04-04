package SalaryCalculator;
public class inheritanceActivity {
    public static void main(String[] args) {
        Manager m=new Manager(126823,"peter","Chennai",2628622,65000);
        Trainee t=new Trainee(254623,"jack","mumbai",400081,45000);
        m.calculateSalary();
        m.calculateTransportAllowance();
        t.calculateSalary();
        t.calculateTransportAllowance();
    }
}
