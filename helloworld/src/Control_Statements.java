public class Control_Statements {
    public static void main(String args[])
    {
        int a=30;
        int b=20;
        if(a>=b)
            System.out.println(+a+ " is greater than or equal to" +b);
        if((a>b)&&(a!=b))
            System.out.println(+a + " is greater than " + b + " and its not equal");
        int month=11;
        String season;
        if(month==12 || month==1 || month==2) {
            System.out.println(season = "winter");
        }
             else if(month==3 || month==4 || month==5) {
            System.out.println(season = "spring");
        }
             else if(month==6 || month==7 || month==8) {
            System.out.println(season = "summer");
        }
             else if(month==9 || month==10 || month==11) {
            System.out.println(season = "Autumn");
        }
                    else {
            System.out.println(season = "Bogus Month");
        }
             System.out.println("November is in the" +season+".");
        }
    }

