package CollectionFramework;


import java.util.*;

public class StudentListEx {
    public static void main(String[] args) {
        ArrayList<Student> sl =new ArrayList<Student>();
        //Adding Student obj to list
        StudentObj ob=new StudentObj();
        for(int i=0;i<4;i++)
            sl.add(ob.st[i]);
        System.out.println(sl);

        /*System.out.println("After changing list to array:");
        Object[] arr=sl.toArray();
        //displaying array elements
        for (int i=0;i<4;i++)
        System.out.println(arr[i]+" , ");
        System.out.println("Array Sorting the list:"+arr);*/
        Student s1 =new Student(101,"Tom","CSE","MUMBAI");
        Student s2 =new Student(102,"Jack","ECE","Hyderabad");
        Student s3 =new Student(103,"Sam","EEE","Pune");
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        //using forloop to display list
        for (Student s : sl) {
            System.out.println(s);
        }
        //using toString to display
        System.out.println(sl.toString());
        System.out.println(sl.remove(0));
        System.out.println(sl.size());
        System.out.println(sl.get(1));
        System.out.println(sl.isEmpty());
        System.out.println(sl.indexOf("Sam"));
        System.out.println(sl.contains(sl));
        //using Iterator to display
        Iterator i=sl.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        //sorting
        ArrayList<String> al =new ArrayList<>();
        al.add("Sam");
        al.add("Ram");
        al.add("Deepthi");
        al.add("Chennai");
        al.add("Pune");
        //before sorting
        System.out.println("Unsorted ArrayList:"+al);
        //sorted
        Collections.sort(al);
        System.out.println("Sorted ArrayList:"+al);
        sl.sort(Comparator.comparing(Student::getName));
        System.out.println(sl);


    }
}
