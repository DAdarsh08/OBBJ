package com.threadex;

public class
SynchronizedThread extends Thread {

    String name;

    public SynchronizedThread(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            SynchronizedThread t1 = new SynchronizedThread("" + i);
            System.out.println(i + " is entering");
            t1.start();
//            t1.join();
            System.out.println(i + " is finished");
        }
    }

    public void run() {
        SynchronizationExample.counter(name);
    }
}
