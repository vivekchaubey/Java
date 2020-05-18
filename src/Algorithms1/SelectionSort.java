package Algorithms1;

import java.util.Scanner;

public class SelectionSort {


    public int[] minFinder(int[] input){
        int min=input[0];
        int minIndex=0;
        int[] output=new int[2];
        for(int i=1;i<input.length;i++){
            if(input[i]<min){
                min=input[i];
                minIndex=i;
            }
        }
        output[0]=min;
        output[1]=minIndex;
        return output;
    }

    public int[] arraySlicer(int[] input,int index){
        int[] output = new int[input.length-index];
        int j=0;
        for(int i=index;i<input.length;i++){
            output[j]=input[i];
            j++;
        }
        return output;
    }

    public int[] selectionSort(int[] input){
        for(int i=0;i<input.length;i++){
            System.out.println("STEP: "+(i+1));
            int[] remArray=arraySlicer(input,i);
            System.out.println("remaining array");
            print(remArray);
            System.out.println("min of rem array is: "+minFinder(remArray)[0]);
            System.out.println("min index of rem array is: "+minFinder(remArray)[1]);
            if(minFinder(remArray)[0]<input[i]){
                System.out.println("swap necessary");
                input[i]=input[i]+input[minFinder(remArray)[1]+i];
                input[minFinder(remArray)[1]+i]=input[i]-input[minFinder(remArray)[1]+i];
                input[i]=input[i]-input[minFinder(remArray)[1]+i];
            }
            System.out.println("after swap");
            print(input);
            System.out.println();
            System.out.println();
        }
        return input;
    }

    public void print(int[] input){
        for (int value : input) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("ITERATE THROUGH THE ITEMS. PICK EACH ITEM IN SEQUENCE AND " +
                "SWAP IT WITH THE MINIMUM OF THE REMAINING ITEMS");

        Scanner sc=new Scanner(System.in);
        SelectionSort ss=new SelectionSort();

        System.out.println("Enter the number of elements to be sorted: ");
        int n = sc.nextInt();
        int[] input=new int[n];
        System.out.println("Inserting the elements");
        for(int i=0;i<n;i++){System.out.println("Element "+(i+1)+":");
            int k=sc.nextInt();
            input[i]=k;
        }
        input=ss.selectionSort(input);
        System.out.println("FINAL RESULT");
        ss.print(input);
    }
}
