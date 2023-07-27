package LambdaExp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafunction {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            arr.add(i+1);
        }
        arr.forEach((item)-> System.out.println(item*2));
        Consumer<Integer>fun=((item)-> System.out.println(item*2));
        arr.forEach(fun);
        Operation sum=(a,b)->(a+b);
        System.out.println( sum.cal(45,89));
        Operation Pro=(a,b)->(a*b);
        Operation sub=(a,b)->(a-b);


        Lambdafunction cal1=new Lambdafunction();
        System.out.println( cal1.operate(5,3,sum));


    }
    private int operate(int a ,int b,Operation op)
    {
        return op.cal(a,b);
    }
}
interface Operation{
    int cal(int a , int b);
}
