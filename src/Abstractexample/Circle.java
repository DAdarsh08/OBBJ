package Abstractexample;

public class Circle extends Figure{
   private int radius;
    final double PI =Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area=  (PI* (int)Math.sqrt(radius));
//        System.out.println(area);
        return area;



    }

    @Override
    public double peri() {
         double peri=2*PI*radius;
         return peri;

    }
}
