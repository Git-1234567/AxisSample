public class Grade {
    int x;
    void display(int x)
    {
        if (x < 25) {
            System.out.println("Grade F");
        } else if ((x >= 25) && (x < 45)) {
            System.out.println("Grade E");
        } else if((x>=45)&&(x<50)) {
            System.out.println("Grade D");
        }else if((x>=50)&&(x<60)){
            System.out.println("Grade C");
        }else if((x>=60)&&(x<80)){
            System.out.println("Grade B");
        }else if((x>=80)&&(x<=100)){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args)
    {
        Grade obj = new Grade();
        obj.display(90);
    }
}
