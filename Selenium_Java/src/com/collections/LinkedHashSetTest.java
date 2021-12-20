package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    /**
     * HashSet doesn't allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
     * HashSet allows null values however if you insert more than one nulls it would still return only one null value.
     * Hashset class implements Set Interface. It uses a hash table for storage. Hashing we use for storing elements in the HashSet
     * @param args
     */
    public static void main(String[] args){

        LinkedHashSet<String> hset = new LinkedHashSet<String>();
        hset.add("Shiva");
        hset.add("Naveen");
        hset.add("Naresh");
        hset.add("Teja");
        hset.add("Naresh");
        hset.add(null);
        hset.add(null);
        System.out.println(hset);
        System.out.println(hset.size());
        hset.forEach((ele)-> System.out.println(ele));

        System.out.println("Iterating through Iterator method..!");
        Iterator iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(hset.isEmpty());
        hset.clear();
        System.out.println(hset.isEmpty());

    }
}
