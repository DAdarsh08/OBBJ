package Object;
class Main{
    public static void main(String[] args) {
        Student kunal=new Student(13,"kunal",78.9f);
        Student rahul=new Student(kunal);
        System.out.println(kunal.rno);
        System.out.println("rahul"+rahul.rno);
        kunal.greeting();
        rahul.greeting();
        Student ace=new Student();
        System.out.println(ace.rno);
        //rahul.changename("goa");
       // rahul.greeting();
    }
}
public class Student {
    int rno;
    String name;
    float marks;
    void greeting()
    {
        System.out.println("hello my name is "+this.name);
    }
    void changename(String name)
    {
        this.name=name;
    }
    Student( Student other)
    {
       this. rno=other.rno;
      this.  name=other.name;
      this.  marks=other.marks;
    }

    Student(int rno, String name, float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    Student ()
    {
        //this.name="ace";
       // this.rno=7;
       // this.marks=100.0f;
        this (13, "default person", 100.0f);
    }

}





