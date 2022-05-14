package hillel.lesson13.homework3;

public class Player implements Playable, Recordable {
    public void printData(){
        record();
        play();
        pause();
        stop();
    }
    @Override
    public void play() {
        System.out.println("Playing started");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void record() {
        System.out.println("Recording started");
    }
}
