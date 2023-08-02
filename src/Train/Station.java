package Train;

public class Station extends Thread {
    String name;
    public Station(String name)
    {
        this.name=name;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=1;i<=3;i++)
        {
            Station train=new Station("train"+i);
            train.start();
           // train.join();
            System.out.println("NOW ALL TRAINS " + i +" IS READY");

        }
        System.out.println("NOW ALL TRAINS ARE READY");
    }
    public void run()
    {

        Track.counter(this.name);
    }
}
