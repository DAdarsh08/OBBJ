package Interface;

public class CDplayer implements Media{// its only implementing media right now;
    @Override
    public void start() {
        System.out.println("Music Starts");
    }

    @Override
    public void stop() {
        System.out.println("Music Stops");

    }
}
