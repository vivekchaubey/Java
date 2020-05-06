package Basics;

import java.util.Arrays;

public class FruitArraySort {
    public static void main(String[] args) {

        String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"};

        Arrays.sort(fruits);

        int i=0;
        for(String temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp);
        }
    }
}
