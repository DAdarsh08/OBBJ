package Defalultinterface;

public interface A {
    default void fun(){
        System.out.println("I am in A");
    }

}
