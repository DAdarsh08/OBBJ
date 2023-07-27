package Generic.Comapare;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student(12,45.9f);
        Student rahul=new Student(5,90.0f);
        Student raj=new Student(1,99.0f);
        Student Arpit=new Student(7,77.0f);
        Student [] arr={kunal,rahul,raj,Arpit};
        System.out.println(Arrays.toString(arr));

       /* Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);

            }
        });*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


       /* if(kunal.compareTo(rahul)<0)
        {
            System.out.println("rahul got higher marks");
        }*/



    }
}
