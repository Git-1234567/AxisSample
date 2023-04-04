package p3;
import java.util.*;
public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        System.out.println("Enter the candidate Details");
        Scanner sc = new Scanner(System.in);
        Candidate c = new Candidate();
        System.out.print("Name");
        String name = sc.nextLine();
        c.setName(name);
        System.out.print("Gender");
        String gender = sc.nextLine();
        c.setGender(gender);
        System.out.print("Expected Salary");
        double sal = sc.nextDouble();
        if (sal < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        } else {
            c.setExpectedSalary(sal);
            return c;
        }
    }
    public static void main(String args[]) {
        Main m = new Main();
        Candidate m1;
        try {
            m1 = m.getCandidateDetails();
            System.out.println("Registration Successful");
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
