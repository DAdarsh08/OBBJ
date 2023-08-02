package com.threadex;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int read;
        Scanner sc = new Scanner(System.in);
        TestThread testThread = null;
        while (true) {

            System.out.println("press 1 to start , 2 to stop ,3 to resume , 4 to suspend");
            read = sc.nextInt();
            switch (read) {
                case 1: {
                    testThread = new TestThread();
                    System.out.println("start");
                    testThread.start();
                    break;
                }
                case 2: {
                    System.out.println("stop");
                    testThread.stop();
                    break;
                }
                case 3: {
                    System.out.println("resume");
                    testThread.resume();
                    break;
                }
                case 4: {
                    System.out.println("suspend");
                    testThread.suspend();
                    break;
                }
                default:
                    System.out.println("wrong choice");
                    return;
            }


        }
    }

  static   class TestThread extends Thread {
      @Override
      public void run() {
          try {
              for (int i = 1; ; i++) {
                  System.out.println(i);
                  Thread.sleep(1000);
              }
          } catch (Exception ex) {
              System.out.println(ex);
          }
      }
  }
}
