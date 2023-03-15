import jade.core.behaviours.CyclicBehaviour;

public class MyCyclicBehaviour extends CyclicBehaviour {

    @Override
    public void action() {
        System.out.println("This is Cyclic");
    }
}
