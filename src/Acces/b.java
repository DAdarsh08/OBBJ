package Acces;

public class b extends A{
    public b(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A a=new A(12,"pp");
        String s=a.name;
        b c=new b(89,"pop");
        s=c.name;
    }
}
