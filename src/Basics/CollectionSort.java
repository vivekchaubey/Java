package Basics;

import java.util.*;

public class CollectionSort implements Comparator
{

    //compares strings from the index position 1 and beyond
    // overridden compare function
    public int compare(Object o1,Object o2)
    {
        String s1 = o1.toString().substring(1);
        String s2 = o2.toString().substring(1);
        return s1.compareTo(s2);
    }


    public static void main(String[] args) {
        String[] strings = {"painful", "mainly", "gaining"};
                System.out.println("sort without comparator started as below");
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }


            System.out.println("sort with comparator started as below");
            String[] strings2 = {"painful", "mainly", "gaining"};

            CollectionSort cs=new CollectionSort();

            //calls the overridden compare function as below
            Arrays.sort(strings2, new CollectionSort());
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings2[i]);
            }


        }//end of main function
        }//end of class

