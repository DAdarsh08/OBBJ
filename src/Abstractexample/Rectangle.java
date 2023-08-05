package Abstractexample;

public class Rectangle extends Figure implements ISides{
  private   int length;
 private    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(int val)
    {
        this.length=val;
        this.width=val;
    }



    @Override
    public double area() {
        int area=length*width;
//        System.out.println(area);
        return  area;

    }

    @Override
    public double peri() {
        int peri=2*(length+width);
//        System.out.println(peri);
        return peri;

    }
    public double diagonal()
    {
        return Math.sqrt((length*length + width*width));
    }

    @Override
    public int sides() {
        return 4;
    }
}
