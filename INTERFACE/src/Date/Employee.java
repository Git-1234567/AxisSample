package Date;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int id;
    private String name;
    private LocalDate Doj;
    public Employee(int id,String name,LocalDate doj)
    {
        this.id=id;
        this.name=name;
        this.Doj=doj;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getDoj()
    {
        return Doj;
    }

    public void setDoj(LocalDate doj)
    {
        Doj = doj;
    }

    public static void main(String[] args) {
        Employee emp[]=new Employee[]{(new Employee(1,"Sam",LocalDate.of(2015,6,23))),
                (new Employee(2,"Deepu",LocalDate.of(2014,4,14))),
                (new Employee(3,"Sona",LocalDate.of(2020,9,26))),
                (new Employee(4,"Satya",LocalDate.of(2018,2,17))),
                (new Employee(5,"Aadhya",LocalDate.of(2012,11,13)))};
        LocalDate currentDate=LocalDate.now();
        int maxYears=0;
        int maxMonths=0;
        int maxDays=0;
        String mostExpEmp="";
        for(int i=0;i< emp.length;i++)
        {
            Period period = Period.between(emp[i].getDoj(),currentDate);
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();
            System.out.println(emp[i].getName() + " has " + years + " years, " + months + " months, " + days +" days");
            if(years > maxYears || (years == maxYears && months > maxMonths) ||
                          (years == maxYears && months == maxMonths && days > maxDays))
            {
                maxYears=years;
                maxMonths=months;
                maxDays=days;
                mostExpEmp="id="+emp[i].getId()+" name="+emp[i].getName()+" Doj="+emp[i].getDoj();
            }
        }
        System.out.println("Most Experience Employee " + mostExpEmp);
    }
}
