package CollectionFramework;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
      //HASHSET
        HashSet<Integer> hs=new HashSet<>();
        hs.add(48);
        hs.add(34);
        hs.add(65);
        hs.add(84);
        hs.add(37);
        hs.add(36);
        System.out.println("HashSet:"+hs);
        //Collections.sort(hs);
        //System.out.println("Sorted HashSet:"+hs);
        hs.stream().sorted();
        System.out.println("Sorted HashSet:" +hs);

        HashSet<String> set=new HashSet<String>();
        set.add("Jack");
        set.add("Tom");
        set.add("Sam");
        set.add("James");
        set.add("Sam");//duplicate not allowed
        System.out.println("An initial list of elements: "+set);
        set.toArray();
        System.out.println("After invoking toArray:"+set);
        //Removing specific element from HashSet
        set.remove("James");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Ram");
        set1.add("Sona");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Tom"));
        System.out.println("After invoking removeIf() method: "+set);
        //using for each loop
        for (String i : set) {
            System.out.println(i);
        }
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method:"+set);
      //LINKED HASHSET
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(35);
        lhs.add(41);
        lhs.add(65);
        lhs.add(11);
        System.out.println("Linked HashSet:"+lhs);


        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(81);
        ts.add(64);
        ts.add(84);
        ts.add(56);
        ts.add(72);
        ts.add(61);
        ts.add(95);
        System.out.println("TreeSet:"+ts);
    }
}
