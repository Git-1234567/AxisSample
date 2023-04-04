package Threads;

public class ThreadDemo extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is my thread" +i);
            //System.out.println(Thread.currentThread().getName()+" " + i);
        }/*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/

    }
}
