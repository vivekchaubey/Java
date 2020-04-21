package Basics;

import java.util.Scanner;

public class MethodAccess{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome ");

        MethodAccess m= new MethodAccess();
        m.func();

    }//main function end

    public void func(){System.out.println("Method access done");}
}//class end

