package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    /*
     LinkedList maintains insertions order. It allows duplicate elements.It uses a doubly linked list internally for storing elements
     and hence the manipulation it is fast as no shifting is required when compared to an ArrayList.
     */
    public static void main(String[] args){
        LinkedList<String> llist = new LinkedList<String>();
        LinkedList<String> llist1 = new LinkedList<String>();
        llist.add("Venkat");
        llist.add("Ram");
        llist.add("Shravan");
        llist.add("Kiran");
        llist.add("Swetha");
        llist.add(null);
        llist.add(null);
        System.out.println(llist);
        llist.remove(0);
        System.out.println("Printing linkedlist after deleting an object");
        System.out.println(llist);
        System.out.println(llist.size());

        llist1.add("Naresh");
        llist1.add("Mounica");
        llist1.add("Teju");

        llist.addAll(llist1);
        System.out.println(llist);

        llist.removeAll(llist1);
        System.out.println(llist);
        System.out.println(llist.isEmpty());
        System.out.println(llist.contains("Hemchand"));

        Iterator iter = llist.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        // LinkedList exclusive methods
        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());
        llist.offerFirst("Sandhya");
        System.out.println(llist.getFirst());
        llist.offerLast("Ramesh");
        System.out.println(llist);
        System.out.println(llist.peek());
        //System.out.println(llist.get(8)); // IndexOutOfBoundsException

        Iterator iter1 = llist.descendingIterator();

        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }



    }
}
