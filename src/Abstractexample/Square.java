package Abstractexample;

public class Square extends Rectangle{
    int side;

    public Square(int side) {

        super(side);
    }

    @Override
    public double area() {
       return   super.area();
    }

    @Override
    public double peri() {
      return   super.peri();

    }
}
