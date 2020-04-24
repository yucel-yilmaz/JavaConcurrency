package com.concurrency;

// Runnable Class
class MyRunnable implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running.");
    }
}

class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
    }
}
