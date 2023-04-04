package Threads;

public class Printer extends Thread{
    Storage s;
    //constructor
    public Printer(String str, Storage s){
        //the name of the new thread
        super(str);
        this.s = s;
    }
    //overriding mthd
    public void run() {
        synchronized (s) {
            System.out.println("Printer starts running");
            for(int i = 0; i<s.num.size(); i++){
                System.out.println("Printer output:"+s.GetNum(i));
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Printer finishes running");
        }
    }
}
