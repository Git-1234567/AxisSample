package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int vow=0,space=0,w=0;
        StringBuffer content=null;
        FileInputStream fs=null;
        int ch;
        try {
            fs = new FileInputStream("D:\\Excercise\\filename.txt");
            content = new StringBuffer();
            while ((ch = fs.read())!= -1) {
                content.append((char) ch);
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                    vow++;
                if (ch == ' ')
                    space++;
            }
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (IOException iox){
            iox.printStackTrace();
        } finally {
            try{
                System.out.println(content);
                System.out.println("Number of vowels:"+vow);
                System.out.println("Number of spaces:"+space);
                String s=new String(content);
                String[] split=s.split("\\s+");
                System.out.println("Number of words:"+split.length);
                fs.close();
            }catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
