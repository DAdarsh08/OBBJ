package Arraylist;
//kunal not used this;in his program;
import java.util.Arrays;

public class CoustumArraylist {
    private int []data;
    private static int DEFAULT_SIZE=10;
    private int size=0;


    public CoustumArraylist(){
        this.data=new int[this.DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isfull())
        {
            this.resize();
        }
        this.data[size++]=num;
    }

    private void resize() {
        int []temp=new int [this.data.length*2];
        for (int i=0;i<this.data.length;i++)
        {
            temp[i]=this.data[i];
        }
        this.data=temp;
    }
    public int remove()
    {
        int removed=this.data[--this.size];
        return removed;
    }
    public int get(int index)
    {
        return this.data[index];
    }
    public void set(int index, int value)
    {
        this.data[index]=value;
    }

    private boolean isfull() {
        return this.size==this.data.length;
    }

    @Override
    public String toString() {
        return "CoustumArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CoustumArraylist list=new CoustumArraylist();
        list.add(34);
        System.out.println(list);
        for (int i=1;i<=15;i++)
        {
            list.add(i*5);
        }
        System.out.println(list);
        System.out.println(list.remove());
        list.add(34);
        System.out.println(list);
    }
}
