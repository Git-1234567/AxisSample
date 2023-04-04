public class AbstractDemo {
    public static void main(String[] args)
    {
        int rad=5,side=4;
        Shape sh = new Circle(rad);
        Shape s1 = new Square(side);
        System.out.println("Area of circle is:"+sh.calculateArea());
        System.out.println("Area of square is:"+s1.calculateArea());
        sh.setColor("Black");
        s1.setColor("Red");
    }
}
