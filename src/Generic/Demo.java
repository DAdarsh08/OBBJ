package Generic;

public class Demo<T> {
    T box;
    public Demo(T box)
    {
        this.box=  box;

    }
    public T getval()
    {
        return this.box;

    }
    public void performSomeTask() {
        if (this.box instanceof String) {
            System.out.println("length of " + box + " is " + (((String) this.box).length()));
        } else if (this.box instanceof Integer) {
            System.out.println("This is integer value " + this.box);
        }
    }


}
