package sia.example.contest.performers;

import sia.example.contest.props.Instrument;
import sia.example.contest.PerformanceException;

public abstract class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;
    
    public Instrumentalist() {
    }
    
    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing.." + song + ": ");
        instrument.play();
    }


    public void setSong(String song) {
        this.song = song;
    }


    public abstract void getInstrument();
}
