package call;

public class Outer {
   static class Inner{
        String name;
        Inner(String name)
        {
            this.name=name;
        }

       @Override
       public String toString() {
           return name;
       }
   }

    public static void main(String[] args) {
        Inner obj=new Inner("Kunal");
        System.out.println(obj.name);
        System.out.println(obj);
    }
}
