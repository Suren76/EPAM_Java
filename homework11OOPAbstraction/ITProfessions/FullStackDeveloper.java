package homework11OOPAbstraction.ITProfessions;

import java.util.Random;

public class FullStackDeveloper extends Developer {
    public FullStackDeveloper(String name, String surname, String[] skills, String[] idesList) {
        super(name, surname, skills, idesList);
    }

    private boolean isFrontEndEndpointAlive() {
        System.out.println("requests to '{baseUrl}/fe/healthCheck'");
        return new Random().nextBoolean();
    }

    private boolean isBackEndEndpointAlive() {
        System.out.println("requests to '{baseUrl}/be/healthCheck'");
        return new Random().nextBoolean();
    }

    @Override
    public boolean doHealthCheck() {
        return isBackEndEndpointAlive() && isFrontEndEndpointAlive();
    }

    @Override
    public void doesWork() {
        System.out.println("Writing web application.");
    }
}
