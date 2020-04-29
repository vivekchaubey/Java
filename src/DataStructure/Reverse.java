package DataStructure;

import java.util.*;

public class Reverse{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements to be entered: ");
        int n = scan.nextInt();

        int array[] = new int[n];

        System.out.println("Reading the elements.");
        for(int i=0;i<n;i++){System.out.println("Enter the element "+(i+1));array[i]=scan.nextInt();}

        System.out.println("Printing the array in reverse order");
        int start=0; int end=n-1;
        while(start<end){int k =array[start];array[start]=array[end];array[end]=k;System.out.println(array[start]);start+=1;end+=-1;}
        while(start<n){System.out.println(array[start]);start+=1;}

    }//main function end
}//class end
