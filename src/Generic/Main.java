package Generic;

public class Main implements GenericInterface<Integer>{
    @Override
    public void display(Integer num) {
        System.out.println("this is num");
    }

    public static void main(String[] args) {
        GenericInterface<Integer> l=new Main();
        l.display(14);
        Main m=new Main();
        m.display(45);
    }
}
