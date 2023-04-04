public class Threewheeler extends Vehicle{
    int noofwheel;
    Threewheeler(String r,int m,int n)
    {
        super(r,m);
        noofwheel=n;
    }
    void display()
    {
        System.out.println("Three wheeler auto");
        super.display();
        System.out.println("No. of leaf:" +noofwheel);
    }
}
