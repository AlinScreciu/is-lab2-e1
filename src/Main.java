
import jade.core.ProfileImpl;
import jade.core.Profile;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class Main {
    public static void main(String[] args) throws StaleProxyException {
        jade.core.Runtime rt = jade.core.Runtime.instance();
        Profile profile = new ProfileImpl();
        AgentContainer mainContainer = rt.createMainContainer(profile);
        try {
            AgentController rma = mainContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
            rma.start();

            AgentController ac = mainContainer.createNewAgent("John", "FirstAgent", null);

            System.out.println(ac.getState() + "!");
            ac.start();
            mainContainer.createNewAgent("Jane", "SecondAgent", null).start();

            mainContainer.createNewAgent("Peter", "SecondAgent", new Object[]{1}).start();
            System.out.println(ac.getState() + "!");
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }

    }
}