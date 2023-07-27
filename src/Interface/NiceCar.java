package Interface;
// so i am using the interface in different classes so overall class i am using like this;
public class NiceCar {
    private Engin engin;// this car is going to have the internal engin of its own;
    Media player=new CDplayer();

    public NiceCar() {
       this.engin=new PowerEngin();
    }

    public NiceCar(Engin engin) {
        this.engin = engin;
    }
    public void start()
    {
        engin.start();
    }
    public void stop()
    {
        engin.stop();
    }
    public void startMusic()
    {
        player.start();

    }
    public void stopMusic()
    {
        player.stop();
    }
    public void upgradeEngin()
    {
        this.engin=new ElectricEngin();
    }
}
