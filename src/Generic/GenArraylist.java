package Generic;

import plolymorphism.Number;
//if you cant understand:   Generics provide type checks at compile time,
// and the produced bytecode only knows classes, methods and interfaces.
// Bytecode is executed at runtime and objects are created at runtime as well,
// Looking at bytecode, it doesn't contain the "type" of object we want to create, so it shows error.


import java.util.Arrays;

public class GenArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public  GenArraylist() {
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
        GenArraylist<Integer>list=new GenArraylist<Integer>();
        list.add(34);
        list.add(44);
        GenArraylist<String>l=new GenArraylist<>();
        l.add("harsh");
      //  list.add("addf");
        list.add(78);
        System.out.println(list);
      // GenArraylist<String >st=new GenArraylist<>();
      //  st.add("Adarsh");
      // st.add("love");
      //  st.add("siri");
      //  System.out.println(st);
    }
}
