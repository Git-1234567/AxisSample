package shapes;

public class ShapeTesting {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(2,3);
        System.out.println("area of rectangle="+r.area());
        System.out.println("perimeter of rectangle="+r.per());

        Square s = new Square(4);
        System.out.println("area of square="+s.area());
        System.out.println("perimeter of square="+s.per());

        Triangle t = new Triangle(2,2,2);
        System.out.println("area of triangle="+t.area());
        System.out.println("perimeter of triangle="+t.per());

        Circle c = new Circle(4);
        System.out.println("area of circle="+c.area());
        System.out.println("perimeter of circle="+c.per());
    }
}
