package homework10OOPInheritance.dummyCallTask;

import homework10OOPInheritance.People;

public class DummyApp {
    protected Call call;

    public DummyApp(People[] peoplesInCall) {
        call(peoplesInCall);
    }

    public void call(People[] peoplesInCall) {
        startCallSession(peoplesInCall);
    }

    public void answer(People[] peoplesInCall) {
        startCallSession(peoplesInCall);
    }

    public void endCall() {
        endCallSession();
    }

    // time unit is seconds
    public long getLastCallTime() {return call.getCallTime();}

    protected void startCallSession(People[] peoplesInCall) {
        if (peoplesInCall.length == 2) {
            call = new Call(peoplesInCall);
        } else {
            System.out.println("In call list should be 2 peoples.");
        }
    }

    protected void endCallSession() {
        call.end();
    }

    protected boolean isInCall() {
        return call.isCallInProgress();
    }
}
