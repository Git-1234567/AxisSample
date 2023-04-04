package Threads;

public class ThreadOne implements Runnable{
    public void run()
    {
        for (int j = 0; j < 10; j++)
        {
            System.out.println("Using runnable interface" + j);
           // System.out.println("***"+ Thread.currentThread().getName()+" " +j);
        }
    }
}
