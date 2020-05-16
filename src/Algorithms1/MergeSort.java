package Algorithms1;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public int[] mergeSort(int[] input){
        if(input.length==1){
            return input;
        }else{
            int[] firstHalf=splitArray(input).get(0);
            int[] secondHalf=splitArray(input).get(1);
            int[] sfh=mergeSort(firstHalf);
            int[] ssh=mergeSort(secondHalf);
            return mergeArrays(sfh,ssh);
        }
    }

    public ArrayList<int[]> splitArray(int[] input){
        ArrayList<int[]> output=new ArrayList<int[]>();
        int[] first;
        int[] second;
        if((input.length%2)==0){
            first=new int[input.length/2];
            second=new int[input.length/2];
            int i=0;
            while (i<first.length){
                first[i]=input[i];
                i++;
            }

            i=0;
            while (i<second.length){
                second[i]=input[(input.length/2)+i];
                i++;
            }
        }else{
            first=new int[(input.length+1)/2];
            second=new int[(input.length-1)/2];

            int i=0;
            while (i<first.length){
                first[i]=input[i];
                i++;
            }
            i=0;
            while (i<second.length){
                second[i]=input[((input.length+1)/2)+i];
                i++;
            }
        }
        output.add(first);
        output.add(second);
        return output;
    }

    public int[] mergeArrays(int[] array1,int[] array2){
        int[] output=new int[array1.length+array2.length];
        int i=0,j=0,k=0;

        while((i<array1.length) && (j<array2.length)){
            if(array1[i]<=array2[j]){
                output[k]=array1[i];
                i++;k++;
            }else{
                output[k]=array2[j];
                j++;k++;
            }
        }

        while(i<array1.length){
            output[k]=array1[i];
            i++;k++;
        }

        while(j<array2.length){
            output[k]=array2[j];
            j++;k++;
        }

        return output;
    }

    public void print(int[] input){
        for (int value : input) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Divide and rule merge sort");

        Scanner sc=new Scanner(System.in);
        MergeSort mg=new MergeSort();

        System.out.println("Enter the number of elements to be sorted: ");
        int n = sc.nextInt();
        int[] input=new int[n];
        System.out.println("Inserting the elements");
        for(int i=0;i<n;i++){System.out.println("Element "+(i+1)+":");
            int k=sc.nextInt();
            input[i]=k;
        }
        input=mg.mergeSort(input);
        System.out.println("FINAL RESULT");
        mg.print(input);
    }
}
