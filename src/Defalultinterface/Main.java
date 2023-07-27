package Defalultinterface;

public class Main implements A,B{
    @Override
    public void greeting() {
        System.out.println("hey ");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.fun();
        m.greeting();
    }
}
