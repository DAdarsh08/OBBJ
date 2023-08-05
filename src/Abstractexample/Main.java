package Abstractexample;

public class Main {
    public static void main(String[] args) {


        Figure fig = new Rectangle(3, 4);
        Rectangle r = new Rectangle(3, 4);
        ISides i=new Rectangle(4,3);

        System.out.println(i.sides());
        System.out.println( fig.area());
        Figure sqr=new Square(5);
        System.out.println( sqr.area());
        Figure cir=new Circle(4);
        System.out.println(cir.area());






    }

}
