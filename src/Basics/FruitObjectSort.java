package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitObjectSort {
    public static void main(String[] args) {
        List<Fruit> list=new ArrayList<>();

        //initialize fruit objects
        Fruit apple=new Fruit("apple","kashmir",40);
        Fruit orange=new Fruit("orange","nagpur",30);
        Fruit banana=new Fruit("banana","nasik",20);
        Fruit lichi=new Fruit("lichi","ballia",10);

        // initialize the list
        list.add(apple);list.add(orange);list.add(banana);list.add(lichi);

        /* sort the list. list is a list of fruit objects. so the list automatically
        sorts based on the given compareto function in the fruit class */
        Collections.sort(list);
        for(Fruit each:list){
            System.out.println(each);
        }
    }
}
