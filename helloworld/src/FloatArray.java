import java.util.Scanner;
public class FloatArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size=sc.nextInt();
        float[] arr=new float[size];
        System.out.print("Enter the array elements:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextFloat();
        float max=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("largest num is "+max);
    }
}
