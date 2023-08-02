package com.threadex;

public class Th extends Thread {
    public static void main(String[] args) {
        Th thread=new Th();
        System.out.println("outside");
        thread.start();

    }
    public void run()
    {
        System.out.println("this code is running in thread");

    }
}
