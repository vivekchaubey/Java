package Algorithms1;

import java.util.Scanner;

public class QuickSort {
    public void print(int[] input){
        for (int value : input) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public int pivotFixer(int[] input,int start,int end){
        int pIndex=0;
        if(start==end){
            pIndex=start;
        }else{
            int pivot=input[end];
            pIndex=start;
            for(int i=start;i<end;i++){
                if(input[i]<=pivot){
                    int temp=input[i];
                    input[i]=input[pIndex];
                    input[pIndex]=temp;
                    pIndex+=1;
                }
            }
            int temp=input[end];
            input[end]=input[pIndex];
            input[pIndex]=temp;
        }
        return pIndex;
    }

    public int[] quickSorter(int[] input,int start,int end){
        if(input.length==1){
            return input;
        }else{
            if(start<end){
                int pIndex=pivotFixer(input,start,end);
                input=quickSorter(input,start,pIndex-1);
                input=quickSorter(input,pIndex+1,end);
            }
        }
        return input;
    }


    public static void main(String[] args) {
        System.out.println("Inplace quick sort");

        Scanner sc=new Scanner(System.in);
        QuickSort qs=new QuickSort();

        System.out.println("Enter the number of elements to be sorted: ");
        int n = sc.nextInt();
        int[] input=new int[n];
        System.out.println("Inserting the elements");
        for(int i=0;i<n;i++){System.out.println("Element "+(i+1)+":");
            int k=sc.nextInt();
            input[i]=k;
        }
        // ready to quicksort
        qs.print(input);
        input=qs.quickSorter(input,0,input.length-1);
        System.out.println("final output*************");
        qs.print(input);
    }
}
