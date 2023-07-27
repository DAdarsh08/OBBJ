package Interface;

public class ElectricEngin implements Engin{
    @Override
    public void start() {
        System.out.println("electric engin starts");
    }

    @Override
    public void stop() {
        System.out.println("electric engin stops");

    }

    @Override
    public void acc() {
        System.out.println("electric engin accelerate");

    }
}
