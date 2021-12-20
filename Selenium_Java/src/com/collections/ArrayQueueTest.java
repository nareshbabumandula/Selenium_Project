package com.collections;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ArrayQueueTest {

    public static void main(String args[]){

        // ArrayDeque is faster than ArrayList and Stack and does not have any capacity restictions
        Deque<String> queue = new ArrayDeque<>();
        queue.add("Naresh");
        queue.add("Hemchand");
        queue.add("Ramesh");
        queue.add("Dayakar");
        queue.add("Naveen");
        queue.add("Ramesh");
        queue.add("Kiran");

        System.out.println(queue);
        queue.poll();
        queue.remove();
        System.out.println(queue.size());
        System.out.println(queue.element()); // Retrieves the head of the queue
        System.out.println(queue.peek()); // Retrieves, but does not remove, the head of this queue,
        System.out.println("Iterate over collection..!");

        Iterator iter = queue.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


    }

}
