package LambdaExp;

public class Main {
    public static void main(String[] args) {
        Demo name=new Demo() {//Anonemous inner Class;
            @Override
            public void print() {
                System.out.println("hi this is me");
            }
        };
        Demo st=()->System.out.println("this is me");
        st.print();


    }

}
