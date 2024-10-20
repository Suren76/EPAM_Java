package homework8OOPAccessModifiers;

public class RemoteControl {
    private SmartLight smartLight;

    public RemoteControl(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    public void resetLight() {
        smartLight = new SmartLight();
    }

    public SmartLight getLightStatus() {
        // 2.Implement a SmartLight getLightStatus() method in the RemoteControl that
        // returns the SmartLight object, allowing access to its status.

        // looks like that this method should not return SmartLight, only true or false

        return smartLight;
    }

    public void changeBrightnessTo(int brightness) {
        smartLight.setBrightness(brightness);
    }
}