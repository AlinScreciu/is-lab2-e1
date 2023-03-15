import jade.core.behaviours.OneShotBehaviour;

public class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println("Oneshot action");
    }
}
