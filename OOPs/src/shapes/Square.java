package shapes;

public class Square extends Shape{
    private int side;
    Square()
    {
        side=1;
    }
    public Square(int side)
    {
        this.side=side;
    }
    public int area()
    {
        return side*side;
    }
    public int per()
    {
        return 4*side;
    }

}
