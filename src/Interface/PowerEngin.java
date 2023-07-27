package Interface;

public class PowerEngin implements Engin{//it implements all the things that are in the engin;
    @Override
    public void start() {
        System.out.println("power engin starts ");
    }

    @Override
    public void stop() {
        System.out.println("power enging stops");

    }

    @Override
    public void acc() {
        System.out.println("power enging accelerates");

    }
}
