import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

import java.util.Date;

public class MyWakerBehaviour extends WakerBehaviour {



    public MyWakerBehaviour(Agent a, Date wakeupDate) {
        super(a, wakeupDate);
    }

    public MyWakerBehaviour(Agent a, long timeout) {
        super(a, timeout);
    }
}
