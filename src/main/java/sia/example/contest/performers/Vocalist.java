package sia.example.contest.performers;

import sia.example.contest.PerformanceException;

public class Vocalist implements Performer {

    String song;

    public Vocalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("lalala");
    }

    public void setSong(String song) {
        this.song = song;
    }
}
