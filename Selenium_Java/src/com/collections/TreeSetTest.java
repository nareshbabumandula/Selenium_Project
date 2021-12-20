package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {

    /**
     * TreeSet implements the Set interface for Storage. Same as HashSet and LinkedHashSet TreeSet also does not allow
     *  duplicate elements. The access and retrieval of elements is quite fast in TreeSet when compared to HashSet and LinkedHashSet
     *  Note:
     *  1. The elements in TreeSet are stored in ascending order
     *  2. It does not allow null elements
     *
     */
    public static void main(String[] args){

        TreeSet<String> tset = new TreeSet<String>();
        tset.add("Swetha");
        tset.add("Naveen");
        tset.add("Naresh");
        tset.add("Teja");
        tset.add("Naresh");
        tset.add("Arun");
        System.out.println(tset);
        System.out.println(tset.size());
        tset.forEach((ele)-> System.out.println(ele));

        System.out.println("Iterating through Iterator method..!");
        Iterator iter = tset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Descending : "  + tset.descendingSet());
        System.out.println(tset.isEmpty());
        tset.clear();
        System.out.println(tset.isEmpty());

    }
}
