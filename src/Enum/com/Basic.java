package Enum.com;

public class Basic {


    enum Week implements A {
        Mon,tue, wed,thu,fri,sat,sun;//objects
        Week()
        {
            System.out.println("constructor called for "+ this);
        }

        @Override
        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Mon;
        week.hello();
       /* for(Week day :Week.values())
        {
            System.out.println(day);
        }*/
        System.out.println(week);
        System.out.println(week.ordinal());// the position of the enum delecaration




    }
}
