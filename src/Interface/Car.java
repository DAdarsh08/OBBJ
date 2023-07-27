package Interface;

public class Car implements Engin ,Break,Media{
    @Override
    public void brak() {
        System.out.println("stoping the car");
    }

    @Override
    public void start() {
        System.out.println("starts like the normal engine");

    }

    @Override
    public void stop() {
        System.out.println("stopping  like the normal engine");

    }

    @Override
    public void acc() {
        System.out.println("accelarating like the normal car");


    }
}
