import java.util.Scanner;

public class SearchArray {
    int search(int[]x,int y)
    {
        int p=-1;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==y)
            {
                p=i;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.print("Enter"+n+"Elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.print("Enter an element to search:");
        int b=s.nextInt();
        SearchArray sa=new SearchArray();
        int c=sa.search(a,b);
        if(c!=-1)
        {
            System.out.println("Given element is present at:"+c);
        }
        else
        {
            System.out.println("Given element is not present in array");
        }
    }
}
