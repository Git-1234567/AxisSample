package shapes;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;
    Triangle()
    {
        side1=1;
        side2=2;
        side3=3;
    }
    public Triangle(int side1,int side2,int side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public int area()
    {
        return (int)((0.5)*side1*side2);
    }
    public int area(int side1,int side2,int side3)
    {
        int side=side1+side2+side3;
        int area=(int) Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
        return area;
    }
    public int per()
    {
        return side1+side2+side3;
    }
}
