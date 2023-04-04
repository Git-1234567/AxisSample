import java.util.Arrays;

public class studentOp
{
    public static void main(String[] args)
    {
        Student s1[]=new Student[]
                {
                        new Student(1,"Deepthi",new int[]{100,50,40,30,80,60}),
                        new Student(2,"Sona",new int[]{90,50,70,90,80,95}),
                        new Student(3,"Sindhu",new int[]{90,50,90,90,95,95}),
                        new Student(4,"Teju",new int[]{100,90,70,90,80,95}),
                        new Student(5,"Sam",new int[]{60,80,30,40,50,100}),
                        new Student(6,"Satya",new int[]{50,90,80,50,65,95}),
                        new Student(7,"Ramya",new int[]{75,50,70,94,88,40}),
                        new Student(8,"Soni",new int[]{57,90,87,75,82,75}),
                        new Student(9,"Rani",new int[]{94,50,80,56,74,95}),
                        new Student(10,"Shalini",new int[]{90,50,60,88,80,95})
                };
        for(int i=0;i< s1.length;i++)
        {
            System.out.println(s1[i]);
        }
    }
}class Student{
    int rollNo;
    String name;
    int[] marks;
    Student(){

    }
    public Student(int rollNo,String name,int[] marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{"+ "rollNo="+rollNo+",name="+name+ ",marks="+ Arrays.toString(marks)+")";
    }
}

