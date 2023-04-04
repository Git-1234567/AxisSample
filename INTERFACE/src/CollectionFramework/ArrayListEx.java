package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList();
        ArrayList <String> al2 =new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        //al2.add(40);
        //al2.add(50);
        al2.add("Deepu");
        al2.add("Deepthi");
        //al.add(1,"Java");
        //display
        System.out.println(al);
        System.out.println(al2);
        System.out.println(al.equals(al2));
        System.out.println(al.contains(30));
        System.out.println(al.indexOf("deepthi"));
        System.out.println(al2.isEmpty());
        System.out.println(al2.toArray());
        System.out.println((al.listIterator(2)));
        System.out.println(al.remove(1));
        //System.out.println(al.get(2));
        System.out.println(al.toString());
        // use for loop
        for(int i=0;i<al2.size();i++)
            System.out.println(al2.get(i)+" ");
        for (Object o:al)
            System.out.println(o);
        //use Iterator
        Iterator i1 =al.iterator();
        while (i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        //use ListIterator
        ListIterator i2 = al2.listIterator();
        while (i2.hasPrevious()){
            System.out.println(i2.previous());
        }
    }
}
