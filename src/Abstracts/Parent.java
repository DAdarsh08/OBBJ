package Abstracts;

public abstract class Parent {

   final int age=1000;
   String name;
  // static int a;

    Parent(String name) {
       this.name=name;
       //this.age=18;
   }

   final void right()
   {
      System.out.println("this is right");
   }


   abstract void career() ;// if one method is abstract then the class will aslo be abstract;// we can not creat
   //we cannot creat abstract static method;but only static is allowd;
   static void colleger()
   {
      System.out.println("hey is am from harvard");
   }
   // we can have normal method too in the parent  class;
   void greeting()
   {
      System.out.println("hey welcome");
   }

   abstract void partner();


}
