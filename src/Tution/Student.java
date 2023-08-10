package Tution;

public class Student implements Comparable<Student>{
    int age;
    int marks;

    public Student(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks- o.marks);
        return diff;
    }
}
