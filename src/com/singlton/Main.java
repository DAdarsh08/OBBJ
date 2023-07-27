package com.singlton;

import Acces.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        A a=new A(30,"kk");
       // System.out.println(a.getNum());
      //  String s= a.name;

    }
}
