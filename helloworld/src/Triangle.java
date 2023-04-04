public class Triangle {
    int side1,side2,side3;
    Triangle(){
    }
    Triangle(int s1,int s2,int s3){
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
    }
    Triangle(int b,int h){
        this.side1=h;
        this.side2=b;
    }
    public float getArea
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 5);
        System.out.println(t.printDetails());
    }
}