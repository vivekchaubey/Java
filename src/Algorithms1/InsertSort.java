package Algorithms1;

import java.util.Scanner;

public class InsertSort {
    public void print(int[] input){
        for (int value : input) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public int[] insertSort(int[] input){
        for(int i=0;i<input.length;i++){
            for(int j=i;j>0;j--){
                if(input[j]<input[j-1]){
                    int temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("First N elements to be sorted at any point of time and N should iterate " +
                "to the end of the input");

        Scanner sc=new Scanner(System.in);
        InsertSort ss=new InsertSort();

        System.out.println("Enter the number of elements to be sorted: ");
        int n = sc.nextInt();
        int[] input=new int[n];
        System.out.println("Inserting the elements");
        for(int i=0;i<n;i++){System.out.println("Element "+(i+1)+":");
            int k=sc.nextInt();
            input[i]=k;
        }
        input=ss.insertSort(input);
        System.out.println("FINAL RESULT");
        ss.print(input);
    }
}

