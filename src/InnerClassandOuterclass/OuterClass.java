package InnerClassandOuterclass;
public class OuterClass {
StaticInner si=new StaticInner();
protected static class StaticInner
{
OuterClass oc=new OuterClass();
}
public static void main(String[] args) {
OuterClass.StaticInner si=new  StaticInner();
StaticInner i= new StaticInner();

//new OuterClass();
}
}