package shapes;

public class Circle extends Shape{
    private int radius;
    Circle()
    {
        radius=1;
    }
    public Circle(int radius)
    {
        this.radius=radius;
    }
    public int area(){
        return (int) (3.14*radius*radius);
    }
    public int per()
    {
        return (int) (2*3.14*radius);
    }
}
