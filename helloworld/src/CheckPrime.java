public class CheckPrime {

    public static void main(String[] args){
        int n=11;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if (count==2)
            System.out.println(n + " is prime");
        else System.out.println(n + " is not prime");
    }
}
