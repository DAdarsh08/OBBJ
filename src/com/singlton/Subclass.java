package com.singlton;

import Acces.A;

public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(33,"kunallll");
        String s=obj.name;
       // A a=new A(12,"l");//we cannot access proteced members using parent class in different package;
     //   s=a.name;
    }
}



