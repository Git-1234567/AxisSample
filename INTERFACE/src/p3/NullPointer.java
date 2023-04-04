package p3;

public class NullPointer {
    public static void main(String[] args) {
        String ptr=null;
        try{
            if(ptr.equals("abc"))
                System.out.print("same");
            else
                System.out.print("not same");
        }catch(NullPointerException n)
        {
            System.out.println(n.getMessage());
        }
    }
}
