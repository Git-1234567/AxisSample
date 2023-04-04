import java.util.Scanner;

public class Rectangle {
    double length;
    double width;
    void Area()
    {
        double area;
        area=this.length*this.width;
        System.out.println("Area of Rectangle is :"+area);
    }
    void perimeter()
    {
        double perimeter;
        perimeter=2*(this.length + this.width);
        System.out.println("Perimeter of Rectangle is :"+perimeter);
    }
}
class Use_Rectangle
{
    public static void main(String[] args)
    {
        Rectangle rect=new Rectangle();
        rect.length=15.854;
        rect.width=22.65;
        System.out.println("Length=" +rect.length);
        System.out.println("Width="+rect.width);
        rect.Area();
        rect.perimeter();
    }
}
