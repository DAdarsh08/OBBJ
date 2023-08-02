package Train;

public class Track {

    public static synchronized void counter(String name)
    {
        System.out.println(name+" inside the track");
        try{
            for (int i=1;i<=10;i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }catch ( Exception e)
        {
            System.out.println(e);
        }
        System.out.println("finished");
    }

}
