package com.concurrency;

class MyThread extends Thread {
    @Override
    public void run() {
        //Get Instance Name
        String name = getName();
        System.out.println(name + " is running!");
    }
}

public class FirstThread {
    public static void main(String[] args) {
        // Create MyThread Object
        MyThread myThread = new MyThread();
        // Call the run () method of the MyThread object
        myThread.start();
    }
}
