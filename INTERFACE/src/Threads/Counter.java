package Threads;

public class Counter extends Thread{
    Storage s;
    //constructor
    public Counter(String str, Storage s){
        //the name of the new thread
        super(str);
        this.s = s;
    }
    //override mthd
    public void run(){
        synchronized (s) {
            System.out.println("Counter starts running");
            for (int i = 0; i < 5; i++) {
                System.out.println("Counter write:" + (i));
                try {
                    s.setNum(i);
                    Thread.sleep(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Counter thread ends running");
       }
    }
}
