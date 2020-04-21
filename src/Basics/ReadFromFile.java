package Basics;

import java.io.*;
import java.lang.*;

public class ReadFromFile {
 public static void main(String args[]) throws IOException{

     try{
         // READ FROM FILE
         File file = new File("readcontent.txt");
         BufferedReader br = new BufferedReader(new FileReader(file));

         String st;
         while((st=br.readLine())!=null){
             FileReader fr = new FileReader("readcontent.txt");
             int i;
             while ((i=fr.read()) != -1){System.out.print((char) i);}

             // READ FROM CONSOLE
             InputStreamReader r=new InputStreamReader(System.in);
             BufferedReader br2=new BufferedReader(r);
             System.out.println("Name: ");
             String name=br2.readLine();
             System.out.println("Welcome "+name);

         }
     }catch (Exception e){
         System.out.println("File not found");
     }

}
}