package com.threadex;

public class SyncoThread extends Thread{
    String name;
    public SyncoThread(String name)
    {
        this.name=name;
    }

    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            SyncoThread thread=new SyncoThread(""+i);
            System.out.println(i +"entering");
            thread.start();
            System.out.println(i+"finished");
        }

    }
    @Override
    public void run()
    {
        SyncoEx.counter(this.name);

    }
}
