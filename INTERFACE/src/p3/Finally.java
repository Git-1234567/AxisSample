package p3;

public class Finally {
    public static void main(String[] args) {
        try{
            //int b=Integer.parseInt(args[0]);
                int x=5/0;
            }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("From finally");
        }
        System.out.println("Hello 11");
    }
}
