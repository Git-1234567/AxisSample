public class Strings {

    public static void main(String[] args)
    {
        String s = "welcome";
        char ch = s.charAt(3);//charAt
        System.out.println(ch);
        byte[] b = s.getBytes();//getBytes
        for (int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        char[] ch1 = s.toCharArray();//toCharArray
        for (char c : ch1) {
            System.out.println(c);
        }
        String s2 = s.toLowerCase();//toLowerCase
        String s3 = s.toUpperCase();//toUpperCase
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        String s4 = "Taj";
        String s5 = "Mahal";
        System.out.println(s4.concat(s5));//concat
        String s7="hello";
        String s8="hello";
        System.out.println(s7.equals(s8));//equals
        String s9="welcome@to@java";
        String[] s10=s9.split("@",2);//split
        for(String s11:s10){
            System.out.println(s11);
        }
        String s12="welcome to java";
        System.out.println(s12.substring(11));//substring



    }
}
