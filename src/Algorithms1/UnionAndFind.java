package Algorithms1;

import java.util.Scanner;

public class UnionAndFind
{

    public int[] initObjects(int n)
    {
        //BASIC ARRAY CREATION
        int[] output=new int[n];
        for(int i=0;i<n;i++)
        {
            output[i]=i;
        }
        return output;
    }


    //if the id of the inputs are equal. they are connected
    public void quickFindCon(int[] iObjects,int p,int q)
    {
        if(iObjects[p]==iObjects[q]){
            System.out.println("given objects are connected");
        }else {
            System.out.println("given objects are not connected");
        }
    }

    /*scrawling through the array to check id of the
     elements and connect */

    public int[] quickUnion(int[] iObjects,int p,int q)
    {
        int pid=iObjects[p];
        int qid=iObjects[q];
        if(pid==qid)
        {
            System.out.println("objects already connected");
        }
        else {
            for(int i=0;i<iObjects.length;i++)
            {
             if(iObjects[i]==qid)
             {
                 iObjects[i]=pid;
             }
            }
        }

        return iObjects;
    }

    // main function and basic verification code
    public static void main(String[] args)
    {
        System.out.println("Welcome to Union Find 101");
        System.out.println("Enter the number of objects to be created: ");

        UnionAndFind UF=new UnionAndFind();
        Scanner scan=new Scanner(System.in);

        int nObjects;
        int[] objects;

        nObjects=scan.nextInt();

        objects=UF.initObjects(nObjects);

        System.out.println("finding a connection");
        UF.quickFindCon(objects,2,3);

        objects=UF.quickUnion(objects,2,3);

        System.out.println("Printing after union");
        for (int object : objects) {
            System.out.println("new  " + object);
        }

        System.out.println("finding the connection after union");
        UF.quickFindCon(objects,2,3);

    }
}
