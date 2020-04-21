package Basics;

import java.util.*;



class newclass{

    public void func(){System.out.println("Method access from new class done");}

}






public class MethodAccess002{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome ");

        newclass m= new newclass();
        m.func();

    }//main function end


}//class end

