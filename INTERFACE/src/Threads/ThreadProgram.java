package Threads;
public class ThreadProgram {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1=new ThreadDemo();
        t1.start();
        for(int i=0;i<10;i++)
        {
            if(i==5)
                t1.suspend();
            if(i==8)
                t1.resume();
            System.out.println("Main Thread:" +i);
        }

        ThreadOne t2=new ThreadOne();
        t2.run();

        //t1.join();//using for "main ends here" at last position
        //t2.join();

        System.out.println("Main ends Here");
    }
}
