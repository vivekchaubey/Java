package Algorithms1;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {
    public void print(int[] input){
        for (int value : input) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public int[] shuffle(int[] input){
        Random random=new Random();
        for(int i=0;i<input.length;i++){
            int r=random.nextInt(i+1);
            int temp=input[i];
            input[i]=input[r];
            input[r]=temp;
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("Enter Sorted Array Input. Entries will not be checked");
        Scanner sc=new Scanner(System.in);
        Shuffle sf=new Shuffle();

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] input=new int[n];
        System.out.println("Inserting the elements");
        for(int i=0;i<n;i++){System.out.println("Element "+(i+1)+":");
            int k=sc.nextInt();
            input[i]=k;
        }
        for(int i=0;i<10000;i++){
            input=sf.shuffle(input);
        }
        sf.print(input);
    }
}
