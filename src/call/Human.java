package call;

public class Human {
    public static void main(String[] args) {
        fun1();
        Human obj2=new Human();
        obj2.fun2();


    }
  static   void fun1()
  {
      Human obj=new Human();
      obj.greeting();

  }
  void fun2()
  {
      greeting();
  }
  void greeting()
  {
      System.out.println("hello");
  }
}
