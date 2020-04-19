package Algorithms1;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements to be entered: ");
        int n = scan.nextInt();

        int[] array = new int[n];

        System.out.println("Reading the elements.");
        for(int i=0;i<n;i++){System.out.println("Enter the element "+(i+1));array[i]=scan.nextInt();}

        System.out.println("Sorting the elements.");
        for(int j=1;j<n;j++){
            for(int i=0;i<n-j;i++){
                if(array[i]>array[i+1]){
                    int k=array[i+1];
                    array[i+1]=array[i];
                    array[i]=k;
                }
            }
        }

        System.out.println("Sorted elements.");
        for(int i=0;i<n;i++){System.out.println(array[i]);}


    }
}
