package sia.example.contest;

public class Magician implements Performer {

    private MagicBox magicBox;
    private String magicWords;

    public Magician() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains..");
        System.out.println(magicBox.getContest());

    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }
}
