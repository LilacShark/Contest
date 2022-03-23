package sia.example.contest.performers;

import sia.example.contest.PerformanceException;

public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {}

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {

        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
