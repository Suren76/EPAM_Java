package homework10OOPInheritance.dummyCallTask;

import homework10OOPInheritance.People;

public class DummyAppPro extends DummyApp {
    protected boolean cameraStatus = false;

    public DummyAppPro(People[] peoplesInCall) {
        super(peoplesInCall);
    }

    protected void startCallSession(People[] peoplesInCall) {
        if (peoplesInCall.length <= 10) {
            call = new Call(peoplesInCall);
        } else {
            System.out.println("The call list should not contain more than 10 people");
        }
    }

    protected void endCallSession() {
        super.endCallSession();
        stopVideoChat();
    }

    public void videoCall(People[] peoplesInCall) {
        startCallSession(peoplesInCall);
        startVideoChat();
    }

    public void startVideoChat() {
        if (isInCall()) {
            onCamera();
        } else {
            System.out.println("Call session needs to start video chat.");
        }
    }

    public void stopVideoChat() {
        if (cameraStatus) {
            offCamera();
        } {
            System.out.println("Video chat session hasn't started.");
        }
    }

    protected void onCamera() {
        cameraStatus = true;
    }

    protected void offCamera() {
        cameraStatus = false;
    }
}
