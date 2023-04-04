package Serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try{
            Employee emp =new Employee(135234,"Sam",125000);
            System.out.println("Employee before serialization " + emp);
            FileOutputStream fos =new FileOutputStream("D:\\Excercise\\filename.txt");
            //serialization
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.flush();
            oos.close();
        }catch (IOException ie){
            ie.printStackTrace();
        }
         try{
             Employee emp;
             FileInputStream fis=new FileInputStream("D:\\Excercise\\filename.txt");
             //serialization
             ObjectInputStream ois=new ObjectInputStream(fis);
             emp=(Employee) ois.readObject();
             ois.close();
             System.out.println("Employee After deserialization " + emp);
         }catch (IOException ie){
             ie.printStackTrace();
         }catch (ClassNotFoundException cnf){
             cnf.printStackTrace();
         }
    }
}
