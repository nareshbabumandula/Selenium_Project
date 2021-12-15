package com.collections;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

public class StackTest {

    /*
     Stack is a subclass of Vector LIFO. Stack has additional methods like push(), peek() etc
     */
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        Stack<String> stack1 = new Stack<String>();
        stack.add("Madhu");
        stack.add("Hemchand");
        stack.add("Naveen");
        stack.add("Preethi");
        stack.add("Naveen");
        stack.add("Himanshu");
        stack.add(null);
        stack.add(null);
        System.out.println(stack);
        stack.remove(0);
        System.out.println("Printing arraylist after deleting an object");
        System.out.println(stack);
        System.out.println(stack.size());
        stack.set(1, "Raghu");
        stack1.add("Naresh");
        stack1.add("Mounica");
        stack1.add("Teju");

        stack.addAll(stack1);
        System.out.println(stack);

        stack.removeAll(stack1);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains("Hemchand"));

        Iterator iter = stack.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());

        System.out.println("Lambda expression starts..!");
        stack.forEach((ele)->System.out.println(ele));

        stack.push("Himaja");

    }
}
