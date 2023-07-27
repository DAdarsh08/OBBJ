package Generic.Comapare;

public class Student implements Comparable<Student> {
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

   @Override
    public String toString() {
        return marks+" ";
    }

   @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
