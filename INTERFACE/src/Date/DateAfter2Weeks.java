package Date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateAfter2Weeks
{
    public static void main(String[] args)
    {
        int noOfDays=14;
        Calendar cal = Calendar.getInstance();
        Date cdate=cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR,noOfDays);
        Date date=cal.getTime();
        System.out.println("Current Date:         " + cdate);
        System.out.println("Date after two weeks: " + date);

        /*LocalDate today = LocalDate.now();
        System.out.println("Today's date: "+today);
        //Add 2 weeks to today's date
        LocalDate afterTwoWeeks = today.plusWeeks(2);
        System.out.println("Date After two weeks: "+afterTwoWeeks);*/

    }
}
