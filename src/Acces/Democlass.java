package Acces;

import java.util.ArrayList;

public class Democlass {
  //  ArrayList <Integer>list = new ArrayList<>(12);
//    list.DEFAULT_CAPACITY=10;
int num ;
float gpa;

    public Democlass(int num , float gpa) {
        this.num=num;
        this. gpa =gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((Democlass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }


   /* protected void finalize() throws Throwable {
        super.finalize();
    }*/

    public static void main(String[] args) {
        Democlass obj=new Democlass(12,34.4f);
        Democlass obj1=new Democlass(12,34.9f);
        Democlass obj2=obj1;
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());//both are point to same odject obj1 and obj2;
       /* if(obj<obj1)
        {
            System.out.println("obj is smaller than obj1");// java will confuse if you want to compare num variable of
            //every object or gpa variable of every object;

        }*/
        if(obj1==obj2)//if these two reference var is pointing to same object;
        {
            System.out.println("equal");
        }
        if(obj.equals(obj2))
        {
            System.out.println("obj is equal obj1");
        }
        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass());//it is inside Object Class . It is final so we cannot override it;




    }
}
