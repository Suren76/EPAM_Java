package homework8OOPAccessModifiers;

public class SmartHomeToolkit {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight(true, 30, "red");
        RemoteControl smartLightRemoteControl = new RemoteControl(smartLight);

        smartLightRemoteControl.changeBrightnessTo(100);
        System.out.println(smartLightRemoteControl.getLightStatus());
        smartLightRemoteControl.resetLight();
    }
}
