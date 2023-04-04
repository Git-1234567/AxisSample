package shapes;
public class Rectangle extends Shape{
    private int len;
    private int bred;
    Rectangle()
    {
        len=1;
        bred=1;
    }
    public Rectangle(int len,int bred)
    {
        this.len=len;
        this.bred=bred;
    }
    public int area(){
        return len*bred;
    }
    public int per(){
        return 2*(len+bred);
    }
}
