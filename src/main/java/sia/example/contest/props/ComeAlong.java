package sia.example.contest.props;

public class ComeAlong implements Poem {

    private static String[] LINES = {"Come along with me",
            "And the butterflies and bees",
            "We can wander through the forest",
            "And do so as we please",
            "Living so merrily"};

    public ComeAlong() {
    }

    public void recite() {
        for (String line: LINES) {
            System.out.println(line);
        }
    }
}
