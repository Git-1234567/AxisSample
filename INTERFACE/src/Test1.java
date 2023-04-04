public class Test1 {
    int a,b;
    Test1(int i,int j)
    {
        a=i;
        b=j;
    }
    void alterPrimitive(int x,int y)
    {
        x=60;
        y=30;
    }
    void alterObject(Test1 o)
    {
        o.a=25;
        o.b=62;
    }
}
class PassOb
{
    public static void main(String[] args) {
        Test1 ob1 = new Test1(100,22);
        System.out.println("Object State before alterPrimitive Method call ob1.a:"+ob1.a+"ob1.b:" +ob1.b);
        ob1.alterPrimitive(ob1.a,ob1.b);
        System.out.println("Object State after alterPrimitive Method call ob1.a:"+ob1.a+"ob1.b:" +ob1.b);
        System.out.println("Object State before alterObject Method call ob1.a:" +ob1.a+ "ob1.b:" +ob1.b);
        ob1.alterObject(ob1);
        System.out.println("Object State after alterPrimitive Method call ob1.a:"+ob1.a+"ob1.b:" +ob1.b);
    }
}
