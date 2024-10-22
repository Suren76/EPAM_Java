package homework8OOPAccessModifiers;

public class SmartLight {
    private boolean isOn = false ;
    private int brightness = 50;
    private String color = "white";

    public SmartLight() {
    }

    public SmartLight(boolean isOn, int brightness, String color) {
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("'"+ brightness +"' is out of required range(0-100)");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toggle() {
        setOn(!isOn);
    }

    public void reset() {
        setBrightness(50);
        setOn(false);
        setColor("white");
    }
}
