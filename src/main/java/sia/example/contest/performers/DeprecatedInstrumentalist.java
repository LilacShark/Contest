package sia.example.contest.performers;

import sia.example.contest.PerformanceException;
import sia.example.contest.props.Instrument;

public class DeprecatedInstrumentalist implements Performer {


    private String song;
    private Instrument instrument;

    public DeprecatedInstrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing.." + song + ": ");
        instrument.play();
    }

    public String screamSong() {
        return song;
    }


    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

}
