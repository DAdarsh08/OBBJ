package InterfaceInheitance;

public class Main implements B{
    @Override
    public void greet() {
        System.out.println("i am of A");
    }

    @Override
    public void fun() {
        System.out.println("i am of B");

    }

    public static void main(String[] args) {
        Main m=new Main();

        m.greet();
        m.fun();
    }
}
