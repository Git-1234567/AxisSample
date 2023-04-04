public abstract class Shape {
    String color;
    abstract double calculateArea();
    void setColor(String clr)
    {
        this.color=clr;
        System.out.println("colour of the shape is: "+this.color);
    }
}
