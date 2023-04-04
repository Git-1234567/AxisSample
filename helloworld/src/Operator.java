public class Operator {
    public static void main(String args[])
    {
        int a=10;
        int b=5;
        int c=6;
      //1.Unary operator:
        System.out.println(-a);
      //2.Binary operator:
        //Arithmetic operator
        int x1=a+b;
        int x2=a-b;
        int x3=b*c;
        int x4=a/c;
        int x5=a%c;
        System.out.println("Addition of "+a+" and"+b+" is= "+x1);
        System.out.println("Subtraction of "+a+" and "+b+" is= "+x2);
        System.out.println("Multiplication of "+a+" and "+b+" is= "+x3);
        System.out.println("Division of "+a+" and "+c+" is= "+x4);
        System.out.println("modulus of "+a+" and "+c+" is= "+x5);
        //Relational operator
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        //Logical operator
        System.out.println(a>b && b>c);
        System.out.println(!(a>b || b>c));
        //Bitwise operator
        System.out.println(a&b);
        System.out.println(a|b);
        //Shift
        int y=a<<3;
        int y1=c>>2;
        System.out.println(y);
        System.out.println(y1);
        //Assignment
        System.out.println(b+=5);
        System.out.println(c*=5);
        //++,--
        System.out.println(a++);
        System.out.println(++c);
        System.out.println(b--);
        System.out.println(--b);
      //3.Ternary operator:
        System.out.println((a>c)?a:c);
    }
}
