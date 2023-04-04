public class Twowheeler extends Vehicle{
    int noofwheel;
    Twowheeler(String r,int m,int n)
    {
        super(r,m);
        noofwheel=n;
    }
    void display()
    {
        System.out.println("Two wheeler tvs");
        super.display();
        System.out.println("No. of wheel: "+noofwheel);
    }
}
