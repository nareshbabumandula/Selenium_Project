package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

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

        Iterator iter = alist.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }






    }
}
