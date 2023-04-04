package Package2;

import Package1.A;

public class D extends A {
    public static void main(String[] args) {
        A obj=new A();
        obj.x1=20;
        D obj1 = new D();
        obj1.x1=40;
        obj1.x3=50;
    }
}
