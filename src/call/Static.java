package call;

public class Static {
    public static void main(String[] args) {
        Main obj=new Main();

        System.out.println(Main.a+" "+Main.b);
        Main.b+=10;
        Main obj2=new Main();
        System.out.println(Main.a+" "+Main.b);

    }
}
