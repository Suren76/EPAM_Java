package homework11OOPAbstraction.ITProfessions;

import java.util.Random;

public class FrontEndDeveloper extends Developer {
    public FrontEndDeveloper(String name, String surname, String[] skills, String[] idesList) {
        super(name, surname, skills, idesList);
    }

    private boolean isFrontEndEndpointAlive() {
        System.out.println("requests to '{baseUrl}/fe/healthCheck'");
        return new Random().nextBoolean();
    }

    @Override
    public boolean doHealthCheck() {
        return isFrontEndEndpointAlive();
    }

    @Override
    public void doesWork() {
        System.out.println("Writing Vue Components.");
    }
}
