import jade.core.Agent;

// To define our own type of agent, we inherit the Agent class from jade.core package
public class FirstAgent extends Agent
{
    // Agent class implements Serializable interface, so we can serialize "objects", i.e. agents,
    private static final long serialVersionUID = 1L;

// Overriding the setup () method inherited from Agent; everything the agent knows/has to
    @Override
    public void setup()
    {
        System.out.println("Hi, my name is " + getLocalName() + " and live in " +
                this.getContainerController().getName());
    }
}