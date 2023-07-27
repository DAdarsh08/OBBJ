package plolymorphism;

public class Number {
    double sum(double a,int b)
    {
        return a+b;
    }
    String sum(String b, double a)
    {
        return b;
    }
    double sum(int a , int b)
    {
        return a+b;
    }
    int sum(int a ,int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Number num=new Number();
        System.out.println( num.sum("harsh",45));// achiveing polymorphism using over loading;

    }
}
