package Tution;

public class Main {
    public static void main(String[] args) {
        Student raj=new Student(12,90);
        Student rahul=new Student(13,78);
        if(raj.compareTo(rahul)>0)
        {
            System.out.println("raj got higher marks");
        }
    }
}
