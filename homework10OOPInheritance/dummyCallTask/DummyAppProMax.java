package homework10OOPInheritance.dummyCallTask;

import homework10OOPInheritance.People;

public class DummyAppProMax extends DummyAppPro{
    protected  boolean screenShareStatus = false;

    public DummyAppProMax(People[] peoplesInCall) {
        super(peoplesInCall);
    }

    protected void endCallSession() {
        super.endCallSession();
        stopScreenShare();
    }

    protected void startScreenShare() {
        if (isInCall()) {
            onScreenShare();
        } else {
            System.out.println("Call session needs to start video chat.");
        }
    }

    protected void stopScreenShare() {
        if (screenShareStatus) {
            offScreenShare();
        } else {
            System.out.println("Screen share session hasn't started.");
        }
    }

    protected void onScreenShare() {
        screenShareStatus = true;
    }

    protected void offScreenShare() {
        screenShareStatus = false;
    }
}
