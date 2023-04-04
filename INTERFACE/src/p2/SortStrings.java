package p2;

import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        int n=10;
        String temp;
        Scanner sc=new Scanner(System.in);
        //create string array called names
        String names[]=new String[10];
        System.out.print("Enter 10 names of student:");
        for(int i=0;i<n;i++)
            names[i]=sc.nextLine();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //to compare one string with another
                if(names[i].compareTo(names[j])>0){
                    //swapping
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        //print output array
        System.out.println("the names in alphabetical order are:");
        for(int i=0;i<n;i++){
            System.out.print(names[i]+" ");
        }
    }
}
