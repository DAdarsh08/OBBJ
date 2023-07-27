package inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight=-1;
    }

    static void greeting()
    {
        System.out.println("boxweight");
    }




    BoxWeight(double l , double w, double h , double weight)
    {
      //  super(l,w,h);// call the parent class constructor;
       // super.weight=67;
        // if no super then call the default constructor;
        super(l,w,h);
       // super.greeting();
        this.weight=weight;
      //  System.out.println(super.weight);
       // System.out.println(this.weight);
    }
    BoxWeight (BoxWeight other){
        super(other);
       weight=other.weight;
    }
    BoxWeight(double side, double weight)
    {
        super(side);
        this.weight=weight;
    }
}
