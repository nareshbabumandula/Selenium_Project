package com.collections;

import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;

public class VectorTest {

    /*
     Vector uses a dynamic array to store the elements. It is same as an ArrayList but the only difference is it is Synchronized
     (Thread-Safe) and also it contains additional methods
     */
    public static void main(String[] args){
        Vector<String> vec = new Vector<String>();
        Vector<String> vec1 = new Vector<String>();
        vec.add("Madhu");
        vec.add("Hemchand");
        vec.add("Naveen");
        vec.add("Preethi");
        vec.add("Naveen");
        vec.add("Himanshu");
        vec.add(null);
        vec.add(null);
        System.out.println(vec);
        vec.remove(0);
        System.out.println("Printing arraylist after deleting an object");
        System.out.println(vec);
        System.out.println(vec.size());
        vec.set(1, "Raghu");
        vec1.add("Naresh");
        vec1.add("Mounica");
        vec1.add("Teju");

        vec.addAll(vec1);
        System.out.println(vec);

        vec.removeAll(vec1);
        System.out.println(vec);
        System.out.println(vec.isEmpty());
        System.out.println(vec.contains("Hemchand"));

        Iterator iter = vec.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());

        // Using lambda with filter condition
        System.out.println("Lambda expression with filter condition starts..!");
        Stream<String> data = vec.stream().filter(e->e.startsWith("H"));
        data.forEach(ele->System.out.println(ele));
        System.out.println("Lambda expression starts..!");
        vec.forEach((ele)->System.out.println(ele));



    }
}
