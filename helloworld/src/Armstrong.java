import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        int i=370,num,temp,count=0;
        num=i;
        while(num!=0)
        {
            temp=num%10;
            count=count+temp*temp*temp;
            num/=10;
        }
        if(count==i)
            System.out.println(i + " is an Armstrong number");
        else
            System.out.println(i + " is not an Armstrong number");
    }
}
