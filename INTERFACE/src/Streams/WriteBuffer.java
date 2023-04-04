package Streams;

import java.io.*;
import java.util.Scanner;

public class WriteBuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to write in file: ");
        String str=sc.nextLine();
        int ch;
        try{
            FileOutputStream fos=new FileOutputStream("D:\\Excercise\\filename.txt",true);
           BufferedOutputStream bos=new BufferedOutputStream(fos);
           bos.write(str.getBytes());
           bos.flush();
           System.out.println("Details entered successfully!");
        } catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        } catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
