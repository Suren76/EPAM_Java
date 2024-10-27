package homework10OOPInheritance.dummyCallTask;

import homework10OOPInheritance.People;

public class Main {
    public static void main(String[] args) {
        DummyAppPro dummyAppPro = new DummyAppPro(new People[]{
                new People("", ""),
                new People("", ""),
                new People("", ""),
        });

        dummyAppPro.endCall();

        System.out.println(dummyAppPro.getLastCallTime());
    }
}
