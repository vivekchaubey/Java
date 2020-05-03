package Basics;;

import java.util.*;

class methods{

    public int[] mergearray(int array1[],int array2[]){int n = array1.length+array2.length;int output[]=new int[n];int k=0;int i=0;int j=0;
        while(k<n){
            if(i<array1.length){output[k]=array1[i];i=i+1;k=k+1;}
            else if(j<array2.length){output[k]=array2[j];j=j+1;k=k+1;}}
        return output;
    }

    public int[] addelement(int array[],int element){
        int n=array.length+1;
        int output[] = new int[n];
        for(int i=0;i<n-1;i++){output[i]=array[i];}
        output[n-1]=element;
        return output;}

    public int[] firstsplit(int array[],int index){
        int newarray[]=new int[index];
        for(int i=0;i<index;i++){newarray[i]=array[i];}return newarray;
    }

    public int[] secondsplit(int array[],int index){
        int newarray[]=new int[array.length-index-1];int i=0;index=index+1;
        while(index<array.length){newarray[i]=array[index];i=i+1;index=index+1;}return newarray;

    }} //end of class method



public class Functions{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements to be put in array1: ");
        int arraylength1 = scan.nextInt();
        int array1[]=new int[arraylength1];
        for(int i=0;i<arraylength1;i++){System.out.println("Enter the element "+(i+1)+": ");array1[i]=scan.nextInt();}
        System.out.println("Enter the number of elements to be put in array2: ");
        int arraylength2 = scan.nextInt();
        int array2[]=new int[arraylength2];
        for(int i=0;i<arraylength2;i++){System.out.println("Enter the element "+(i+1)+": ");array2[i]=scan.nextInt();}
        System.out.println("Merging the arrays");
        methods m =new methods();
        int output[]=new int[arraylength1+arraylength2];
        output=m.mergearray(array1,array2);
        for(int i=0;i<output.length;i++){System.out.println(output[i]);}


        System.out.println("Enter the element to be appended at the end of the array: ");
        int element = scan.nextInt();
        int output2[]=new int[output.length+1];
        output2=m.addelement(output,element);
        System.out.println("Adding the element at the end of the array");
        for(int i=0;i<output2.length;i++){System.out.println(output2[i]);}


        System.out.println("Enter the index where split has to occur: ");
        int index = scan.nextInt();
        int firstarray[];
        firstarray=m.firstsplit(output2,index);
        System.out.println("Firstarray before index split: ");
        for(int i=0;i<firstarray.length;i++){System.out.println(firstarray[i]);}

        int secondarray[];
        secondarray=m.secondsplit(output2,index);
        System.out.println("Secondarray after index split: ");
        for(int i=0;i<secondarray.length;i++){System.out.println(secondarray[i]);}

    }//main function end

}//class end
