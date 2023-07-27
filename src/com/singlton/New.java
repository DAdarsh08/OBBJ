package com.singlton;

public class New extends Subclass {

    public New(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        New n=new New(12,"ooo");
        String s=n.name;//using child of the subclass we can acces the protectd in different pacakage;
    }
}
