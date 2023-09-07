package com.threadex;

public class Example extends Thread {


    int delay;

    public Example(int delay) {
        this.delay = delay;
    }

    public static void main(String[] args) throws InterruptedException {
        Example e1 = new Example(1000);

        e1.start();
        Example e2 = new Example(500);
        e2.start();
      // e1.join();
      //  e2.join();
        System.out.println("Done");
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(this.getName() + " : " + i);
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}


