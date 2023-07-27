package Generic;

//import plolymorphism.Number;

import java.util.Arrays;
import java.util.List;

// t  can be number and its subclass too;
public class WildCard <T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public void addlist (List<Number> list)
    {
        // do something;

        //here you can only  pass Number;

    }
    public void addlist2(List<? extends Number>list)
    {
        // do something;
        // here you can pass Number as well as its Subclasses;
    }


    public  WildCard() {
        data = new Object[this.DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed =(T) data[--size];
        return  removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    private boolean isfull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "GenArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCard <Integer>list=new WildCard<>();
        list.add(34);
        list.add(44);
        list.add(78);
        System.out.println(list);
      //  WildCard<String>st=new WildCard<String>();
        //GenArraylist<String >st=new GenArraylist<>();

      //   st.add("Adarsh");
        //  st.add("love");
        //   st.add("siri");
        //  System.out.println(st);
    }

}
