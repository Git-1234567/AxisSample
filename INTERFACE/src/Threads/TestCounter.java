package Threads;

public class TestCounter {
    public static void main(String[] args) {
        Storage s = new Storage();
        Printer printer = new Printer("Printer",s);
        Counter counter = new Counter("Counter",s);
        counter.start();
        printer.start();
    }
}
