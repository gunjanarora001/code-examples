package command;

public class LightSwitchCommand implements Command {
    private Light light;
    private boolean isOn;

    public LightSwitchCommand(Light light, boolean isOn) {
        this.light = light;
        this.isOn = isOn;
    }

    public void execute() {
        if (isOn) {
            light.turnOn();
        } else {
            light.turnOff();
        }
    }
}
