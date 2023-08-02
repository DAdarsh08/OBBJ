package Interface;

public class Ex implements Test{




    @Override
    public void ans() {
        System.out.println("this is ans");
    }

    public static void main(String[] args) {
       // Ex t=new Ex();
        System.out.println(Ex.a);
        System.out.println(Test.a);
        Test.print();
      //  Ex.print();// in interface static mehods cannot be inherited but members can;

    }
}
