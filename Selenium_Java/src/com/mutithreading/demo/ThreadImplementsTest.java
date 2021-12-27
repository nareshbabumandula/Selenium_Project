package com.mutithreading.demo;

public class ThreadImplementsTest implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running..!");
    }

    public static void main(String[] args){
        ThreadImplementsTest tt = new ThreadImplementsTest();
        Thread t2 = new Thread(tt);
        t2.start();

    }
}
