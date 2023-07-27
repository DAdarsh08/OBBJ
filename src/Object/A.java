package Object;

public class A {
    final int car=10;
    String name;
    int rupees;
    A(String name, int rupees)
    {
        this.name=name;
        this.rupees=rupees;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object distroyed");
    }
}
class B{
    public static void main(String[] args) {
       // A maruti=new A("m1",1000000);
        for(int i=0;i<=10000000;i++)
        {
            A maruti=new A("m1",1000000);

        }

       // System.out.println(maruti.car);
       // maruti.car=67;//because car is premetive with the final keyword;
     //  final A ferrari=new A("A1",40000000);
      // ferrari.name="my name";
       //ferrari.rupees=12;
       //ferrari.car=12;
      //  System.out.println(ferrari.name +" "+ferrari.rupees);
       // ferrari=maruti;we cannot do this;


        //ferrari=new A("sjfas",8787);//since ferrari is not premetive so we cannot point it to other object;

    }
}
