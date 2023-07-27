package Abstracts;

public class Son extends Parent{

//Abstract is just a grnalize form .so that every child class can override it;
    Son(String name) {
        super(name);
    }

    @Override
    void career() {
        System.out.println("i want to become a doctor");
    }
    @Override
    void partner(){
        System.out.println("i love peppar pots");

    }
}
