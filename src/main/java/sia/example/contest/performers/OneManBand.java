package sia.example.contest.performers;

import sia.example.contest.props.Instrument;
import sia.example.contest.PerformanceException;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer{

    private Collection<Instrument> instruments; //для внедрения коллекций
    private Map<String, Instrument> instrumentMap; // для внедрения отображений мап
    private Properties instrumentsProp; // для внедрения свойств

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        // обработка коллекции
//        for (Instrument instrument: instruments) {
//            instrument.play();
//        }

        // обработка отображений
        for (String key: instrumentMap.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instrumentMap.get(key);
            instrument.play();

        // обработка свойств

        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }

    public void setInstruments(Properties instruments) {
        this.instrumentsProp = instruments;
    }

}
