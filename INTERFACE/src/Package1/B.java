package Package1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.x1=5;
        obj.x3=2;
        obj.x4=10;
        System.out.println("public variable of class in same package:"+obj.x1);
        System.out.println("protected variable of class in same package:"+obj.x3);
        System.out.println("default variable of class in same package:"+obj.x4);
    }
}
