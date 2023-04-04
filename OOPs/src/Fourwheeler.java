public class Fourwheeler extends Vehicle
    {
        int noofwheel;
        Fourwheeler(String r,int m,int n)
        {
            super(r,m);
            noofwheel=n;
        }
        void display()
        {
            System.out.println("Four wheeler car");
            super.display();
            System.out.println("No. of leaf:" +noofwheel);
        }
    }

