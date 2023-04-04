package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1=new Date(2000-1900,10,13);
        Date d2=new Date();
        Date d3=new Date(2010-1900,3,14);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        Date d4=new Date(1621709639111L);
        long l=1000;
        d1.setTime(l);
        long t1=d2.getTime();
        System.out.println("Time After setting: "+d1);
        System.out.println("getting time: "+t1);

        System.out.println(d1);
        System.out.println("The current date is: "+d2);
        System.out.println("seconds: " +d2.getSeconds());
        System.out.println("The current year is: "+d3.getYear());
        System.out.println(d3);
        System.out.println("The date calculated from miliseconds is: "+d4);
        boolean a=d3.after(d1);
        System.out.println("Date d3 comes after " + "date d2: "+a);
        boolean b=d3.before(d2);
        System.out.println("Date d3 comes before " + "date d2: "+b);
        System.out.println(d1.compareTo(d2));//comparing
        System.out.println(d1.equals(d3));//equals
        System.out.println("Milliseconds from Jan 1 "+"1970 to date d1 is " +d1.getTime());
        System.out.println("Before setting: "+d2);
        d2.setTime(204587433443L);
        System.out.println("After setting: "+d2);

    }
}
