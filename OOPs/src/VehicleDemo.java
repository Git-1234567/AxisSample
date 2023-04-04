public class VehicleDemo
{
    public static void main(String[] args)
    {
        Twowheeler t1=new Twowheeler("TN74 1234",1,2);
        Threewheeler th1=new Threewheeler("TN74 5672",4,3);
        Fourwheeler f1=new Fourwheeler("TN34 4528",5,4);
        t1.display();
        th1.display();
        f1.display();
    }
}
