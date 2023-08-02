package com.threadex;


   // If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:

      //  Extend Example
public class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
/*  If the class implements the Runnable interface,
 the thread can be run by passing an instance of the class to a Thread object's constructor and
  then calling the thread's start() method:

 ***Implement Example
public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}*/
//Differences between "extending" and "implementing" Threads
//The major difference is that when a class extends the Thread class,
// you cannot extend any other class, but by implementing the Runnable interface,
// it is possible to extend from another class as well,
// like: class MyClass extends OtherClass implements Runnable.


//***Concurrency Problems
// Because threads run at the same time as other parts of the program,
// there is no way to know in which order the code will run.
// When the threads and main program are reading and writing the same variables,
// the values are unpredictable. The problems that result from this are called concurrency problems.
