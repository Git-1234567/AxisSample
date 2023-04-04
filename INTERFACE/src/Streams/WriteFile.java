package Streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        String content;
        File f=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string to write into file:");
        content=sc.nextLine();
        try{
            f=new File("D:\\Excercise\\filename.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter fw=new FileWriter(f,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("String Written to the file");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
