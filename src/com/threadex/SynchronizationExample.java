package com.threadex;

public class SynchronizationExample {


    public static synchronized void counter(String name) {
        System.out.println(name + " is inside");
        try {
            for (int i = 1; i <= 10; i++) {

                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(name + " is out");
    }
}
