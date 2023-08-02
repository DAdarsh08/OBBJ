package com.threadex;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample());//it takes object of Runnable;
        Thread t2 = new Thread(new ThreadExample());
        t1.start();
        t2.start();
    }
}
