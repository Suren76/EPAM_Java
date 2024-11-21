package homework11OOPAbstraction.ITProfessions;

import java.util.Random;

public class TestAutomationEngineer extends Developer {
    public TestAutomationEngineer(String name, String surname, String[] skills, String[] idesList) {
        super(name, surname, skills, idesList);
    }

    private boolean isThereExistsTestCase() {
        System.out.println("Check is there exists test cases.");
        return new Random().nextBoolean();
    }

    @Override
    public boolean doHealthCheck() {
        return isThereExistsTestCase();
    }

    @Override
    public void doesWork() {
        System.out.println("Writing Autotests.");
    }
}
