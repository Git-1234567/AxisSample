public class Test {
    public static void main(String[] args)
    {
        //Rectangle
        double length=2.0;
        double breadth=3.0;
        Rectangle r=new Rectangle(length,breadth);
        System.out.println("Rectangle-Area:"+r.area());
        System.out.println("Rectangle-Perimeter:"+r.perimeter());
        //circle
        double radius=2.0;
        Circle c=new Circle(radius);
        System.out.println("Circle-Area:"+c.area());
        System.out.println("Circle-Perimeter:"+c.perimeter());
        //square
        double side=3.0;
        Square s=new Square(side);
        System.out.println("Square-Area:"+s.area());
        System.out.println("Square-Perimeter:"+s.perimeter());
    }
}
