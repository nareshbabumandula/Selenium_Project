package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    /*
     ArrayList maintains insertions order. It allows duplicate elements.It uses a dynamic array internally for storing
     duplicate elements of different data types
     */
    public static void main(String[] args){
        ArrayList<String> alist = new ArrayList<String>();
        ArrayList<String> arrlist = new ArrayList<String>();
        alist.add("Madhu");
        alist.add("Hemchand");
        alist.add("Naveen");
        alist.add("Preethi");
        alist.add("Naveen");
        alist.add(null);
        alist.add(null);
        System.out.println(alist);
        alist.remove(0);
        System.out.println("Printing arraylist after deleting an object");
        System.out.println(alist);
        System.out.println(alist.size());

        arrlist.add("Naresh");
        arrlist.add("Mounica");
        arrlist.add("Teju");

        alist.addAll(arrlist);
        System.out.println(alist);

        alist.removeAll(arrlist);
        System.out.println(alist);
        System.out.println(alist.isEmpty());
        System.out.println(alist.contains("Hemchand"));
        alist.set(1, "Junaid");

        Iterator iter = alist.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        // Applying lambda on an ArrayList
        // Lambda expression syntax: (arguments list)->{body}
        System.out.println("Lambda expression starts..!");
        alist.forEach((ele)->System.out.println(ele));
    }
}
