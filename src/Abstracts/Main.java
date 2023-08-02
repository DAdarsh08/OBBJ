package Abstracts;

public class Main {
    public static void main(String[] args) {
        Son s=new Son("Luffy");
        s.career();
        s.right();
        Daughter d= new Daughter("Nami");
        d.partner();
        d.right();// final member and methods can be inherited but cnnot override;
        System.out.println(d.age);
        System.out.println(d.name);
        System.out.println(d.age);
        Daughter.colleger();//static can be inherited but cannot override;
        //Parent a= new Parent();//we cannot create the object of Abstract class;
        Parent p= new Son("Luffy");//but you can creat a ref.type variabe and a object of type child class;
        s.partner();

        // cannot use final behind class bcz it will prevent it from inheriting;
        //but we can use final inside the parent class body;
        Parent.colleger();


    }
}
