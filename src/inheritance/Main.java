package inheritance;

public class Main {
    public static void main(String[] args) {
      //  Box obj1=new Box();
      //  System.out.println(obj1.l);
       // Box obj2=new Box(7.09,6.99,10.0);
      //  System.out.println(obj2.w);
      //  Box obj3=new Box(obj2);
       // System.out.println(obj3.w);
       // BoxWeight obj=new BoxWeight();
     //   System.out.println(obj.w);
       BoxWeight obj1=new BoxWeight(5.5,6.7,9.0,10.0);
       // System.out.println(obj1.h);
       BoxWeight obj2=new BoxWeight(obj1);
        System.out.println(obj2.w);
        System.out.println(obj2.weight);
   //     System.out.println(super.weight);
       // System.out.println(obj1.l);
       Box box1=new BoxWeight(3.4,5.5,8.0,9.0);// only ref type members can be accecs;
       System.out.println(box1.w);
      //  System.out.println(box1.weight);
      //  System.out.println(box1.weight);
    //    System.out.println(box1.h);
      //  BoxWeight box2=new Box(1.0,2.3,6.5);//we cannot initialise weight;
        Boxprice box=new Boxprice(3.0,55.5,500);
        System.out.println(box.cost);
        System.out.println(box.w);
        Boxprice b=new Boxprice();
        System.out.println(b.w);

        Box bb= new BoxWeight();
        Box.greeting();



    }
}
