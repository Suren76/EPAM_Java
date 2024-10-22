package homework8OOPAccessModifiers;

public class RemoteControl {
    private SmartLight smartLight;

    public RemoteControl(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    public void resetLight() {
        smartLight.reset();
    }

    public boolean getLightStatus() {
        return smartLight.isOn();
    }

    public void changeBrightnessTo(int brightness) {
        smartLight.setBrightness(brightness);
    }
}