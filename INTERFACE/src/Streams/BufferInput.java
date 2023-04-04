package Streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInput {
    public static void main(String[] args) {
        FileInputStream f=null;
        BufferedInputStream bin=null;
        try{
            f=new FileInputStream("D:\\Excercise\\filename.txt");
            bin=new BufferedInputStream(f);
            byte[] contents=new byte[1024];
            int bytesRead=0;
            String strcontent;
            while((bytesRead=bin.read(contents))!=-1){
                strcontent=new String(contents,0,bytesRead);
                System.out.println("The content of file read using BufferedInputStream is:"+strcontent);
            }
        }catch (IOException io){
            io.printStackTrace();
        }finally {
            try{
                bin.close();
            }catch(IOException io){
                io.printStackTrace();
            }
        }
    }
}
