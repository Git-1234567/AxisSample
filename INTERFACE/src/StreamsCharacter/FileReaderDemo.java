package StreamsCharacter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fr=null;
        try{
            fr=new FileReader("D:\\Excercise\\data.txt");
            int ch;
            while((ch=fr.read())!=-1){
                System.out.println((char) ch);
            }
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }finally {
            try{
                fr.close();
            }catch (IOException ie){
                ie.printStackTrace();
            }
        }
    }
}
