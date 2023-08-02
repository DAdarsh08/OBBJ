package com.threadex;

public class Th1 implements Runnable{
    @Override
    public void run() {
        System.out.println("this is in thread");
    }

    public static void main(String[] args) {
        Th1 obj=new Th1();
        Thread thread=new Thread(obj);
        thread.start();
    }
}
