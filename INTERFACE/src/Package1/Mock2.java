package Package1;

import java.util.HashSet;
import java.util.Scanner;

public class Mock2 {
    public int lengthOfLongestSubstring()
    {
        String s=" ";
        if(s==null||s.length()==0)
        {
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int result=1;
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            char c=s.charAt(j);
            if(!set.contains(c))
            {
                set.add(c);
                result=Math.max(result, set.size());
            }
            else {
                while(i<j)
                {
                    if(s.charAt(i)==c)
                    {
                        i++;
                        break;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print("Enter a string:");
        Mock2 m=new Mock2();
        m.lengthOfLongestSubstring();
    }
}
