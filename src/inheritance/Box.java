package inheritance;

public class Box {
     double l;
    double w;
    double h;
   // double side;
  //  double weight;
   static void greeting()
    {
        System.out.println("hey i am in the box");
    }
    Box()
    {
        this.l=-1;
        this.w=-1;
        this.h=-1;


    }
    Box(double l, double w ,double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box old)
    {
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    Box(double side)
    {
        this.l=side;
        this.w=side;
        this.h=side;
    }



}
