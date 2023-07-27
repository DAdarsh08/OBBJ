package Interface;

public class Main {
    public static void main(String[] args) {
      /*  Car car=new Car();
        car.brak();
        car.start();
       Media m=new Car();
        m.start();*/
        NiceCar car=new NiceCar();//without creating the new object you are able change the part  of the engin;
        car.start();
        car.startMusic();
        car.upgradeEngin();
        car.start();
        car.stop();
        car.startMusic();

    }
}
