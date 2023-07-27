package Generic;

public class Examplemain {
    public static void main(String[] args) {
        ExampleGen g=new ExampleGen("hey this is me");
        ExampleGen x=new ExampleGen(67);
        Demo<Integer> d=new Demo<>(78);
        Demo<String> st=new Demo<>("hello my name is brook");
        System.out.println(st.getval());
        // generic thorows error at compile time
        System.out.println(st.box.getClass().getName());
        System.out.println(d.box.getClass().getName());
        d.performSomeTask();
        st.performSomeTask();


    }
}
