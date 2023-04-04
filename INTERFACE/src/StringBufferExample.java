public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb.append("java"));//append(String str)
        StringBuffer sb1 = new StringBuffer("Hello ");
        System.out.println(sb1.insert(1,"java"));//insert
        StringBuffer sb2 = new StringBuffer("Hello ");
        System.out.println(sb2.replace(1,3,"java"));//replace
        StringBuffer sb3 = new StringBuffer("Hello ");
        System.out.println(sb3.delete(1,3));//delete
        StringBuffer sb4 = new StringBuffer("Hello");
        System.out.println(sb4.reverse());//reverse
        StringBuffer sb5 = new StringBuffer("Hello Java");
        System.out.println(sb5.deleteCharAt(7));//deleteCharAt
        StringBuffer sb6 = new StringBuffer("welcome");
        System.out.println(sb6.length());//length
        System.out.println(sb6.capacity());//capacity

    }
}
