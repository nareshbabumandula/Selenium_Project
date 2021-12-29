package com.mutithreading.demo;

class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    public ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating thread : " + threadName);
    }

    public void run() {
        System.out.println("Running : " + threadName);
        System.out.println("Thread ID is : " + t.getId());
        System.out.println("Thread name is : " + t.getName());
        System.out.println("Thread priority is : " + t.getPriority());

        try {
            for (int i=5; i>0;i--){
                System.out.println("Thread : " + threadName + "," + i);
                t.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " +  threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }

    public void start(){
        System.out.println("Starting " +threadName);
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class TestExtendsThread{

    public static void main(String args[]){
        ThreadDemo t1 = new ThreadDemo("Thread-1");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Thread-2");
        t2.start();
    }

}