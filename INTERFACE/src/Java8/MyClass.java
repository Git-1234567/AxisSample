package Java8;

public class MyClass implements MyInterface{
    public static void main(String[] args) {
        //call interface static method on interface
        MyInterface.display();
        MyClass mc=new MyClass();
        //call default method on class
        mc.show();
    }
}
