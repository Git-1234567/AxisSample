package CollectionFramework;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class VectorListEx {
    public static void main(String[] args) {
        List vl =new Vector<>();
        vl.add(10);
        vl.add(10);
        vl.add(20);
        vl.add(30);
        vl.add(2,50);
        System.out.println(vl.get(4));
        System.out.println(vl);
        vl.remove(1);
        System.out.println(vl);
        vl.sort(Comparator.reverseOrder());
        System.out.println(vl);
    }
}
