import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class MyTickerBehaviour extends TickerBehaviour {
    private final Integer tick;

    public MyTickerBehaviour(Agent a, long period) {
        super(a, period);
        tick = 0;
    }

    @Override
    protected void onTick() {
        System.out.printf("Tick: %d", tick);
    }
}
