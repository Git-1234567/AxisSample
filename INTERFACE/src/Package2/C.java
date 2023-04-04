package Package2;

import Package1.A;

public class C {
    public static void main(String[] args) {
        A obj = new A();
        obj.x1=10;
        System.out.println("public variable of class in another package:"+obj.x1);
    }
}
