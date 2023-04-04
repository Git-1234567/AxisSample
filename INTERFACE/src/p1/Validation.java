package p1;
import java.util.Scanner;
public class Validation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your ID:");
        String Id=sc.nextLine();
        String regex="^GBL/([0-9]){3}/[0-9]{4}";
        if(Id.length()==12)
        {
            if(Id.matches(regex))
            {
                System.out.println("Login Success");
            }else
            {
                System.out.println("Incorrect Id");
            }
        }
        else
        {
            System.out.println("Incorrect Id");
        }
    }
}
