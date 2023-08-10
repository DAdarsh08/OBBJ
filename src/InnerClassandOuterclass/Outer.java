package InnerClassandOuterclass;

public class Outer {
    Inner in=new Inner();

    private class Inner{
        Inner  in =new Inner();
        Outer out=new Outer();

    }

    public static void main(String[] args) {
        Outer out=new Outer();
        out.new Inner();
        Outer.Inner in=new Outer().new Inner();
    }
}
   /* The Inner Class being instance, it can only be created through an instance of the Outer Class.
        The Inner Class can be accessed directly from within by code inside the Outer Class. The Outer
        Class can be accessed inside the Inner Class and vice versa. Outside of the OuterClass the data
        type for the InnerClass is OuterClass.InnerClass and Objects of the InnerClass can only be
        created via instances of the OuterClass.*/