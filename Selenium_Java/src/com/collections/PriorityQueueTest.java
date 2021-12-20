package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String args[]){

        // Priority  Queue class implements the Queue interface. It does not allow null values
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Naresh");
        queue.add("Hemchand");
        queue.add("Ramesh");
        queue.add("Dayakar");
        queue.add("Naveen");
        queue.add("Ramesh");

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
