package Acces;

public class Main {

    public static void main(String[] args) {
        A a=new A(10,"kunal");
        System.out.println(a.getNum());
        a.setNum(12);
        System.out.println(a.getNum());
    }
}
