package com.mutithreading.demo;

public class ThreadExtendsTest extends  Thread{


    @Override
    public void run() {
        try {
            Thread.sleep(5000); // It moves the thread to the timed waiting state
            System.out.println("Executing run method..!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args){
        ThreadExtendsTest t1 = new ThreadExtendsTest();
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        Thread t2 = new Thread();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
    }
}
