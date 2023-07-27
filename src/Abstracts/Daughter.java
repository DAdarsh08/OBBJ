package Abstracts;

public class Daughter extends Parent{
    Daughter(String name) {
        super(name);
    }

    @Override
    void career() {
        System.out.println("i want to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i love iron man");

    }
}
