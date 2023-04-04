public class Greatest {
    int a=10;
    int b=30;
    int c=50;
    int d=20;
    int e=40;
     void display()
     {
         if((a>=b)&&(a>=c)&&(a>=d)&&(a>=e))
         {
             System.out.println(a);
         }else if((b>=c)&&(b>=d)&&(b>=e))
         {
             System.out.println(b);
         } else if((c>=d)&&(c>=e))
         {
             System.out.println(c);
         }else if(d>=e)
         {
             System.out.println(d);
         }else{
             System.out.println(e);
         }
     }
    public static void main(String[] args)
    {
        Greatest obj=new Greatest();
        obj.display();
    }
}
