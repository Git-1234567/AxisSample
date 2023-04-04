package StreamsCharacter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr=new FileReader("D:\\Excercise\\data.txt");
            br=new BufferedReader(fr);
            String line=null;
            System.out.println("The data which is taken from the file " + "to the buffer is: ");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }finally {
            try{
                fr.close();
                br.close();
            }catch (IOException ie){
                ie.printStackTrace();
            }
        }
    }
}
