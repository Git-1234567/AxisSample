package Java8;

public interface MyInterface {
    default void show(){
        System.out.println("In Java 8 default method");
    }
    static void display(){
        System.out.println("In Java 8 Static method");
    }
}
