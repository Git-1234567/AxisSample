package Date;

import java.time.LocalDate;
import java.time.Period;

public class Experience {
    public static void main(String[] args) {
        LocalDate currentTime=LocalDate.now();
        System.out.println("Today date:  "+ currentTime);
        LocalDate joiningDate=LocalDate.of(2013,04,14);
        System.out.println("Joining date: " +joiningDate);
        Period exp=Period.between(joiningDate,currentTime);
        System.out.println("Experience is " +exp.getDays()+ " days, "+exp.getMonths()+" month, "+exp.getYears()+" years");

        /*LocalDate current=LocalDate.now();
        LocalDate doj=LocalDate.of(2013,03,29);
        int exp= Period.between(doj,current).getYears();
        System.out.println(exp);*/
    }
}
