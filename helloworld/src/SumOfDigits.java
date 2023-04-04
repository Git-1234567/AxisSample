import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        int i,num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        i=sc.nextInt();
        while(i>0)
        {
            num=i%10;
            sum=sum+num;
            i=i/10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
