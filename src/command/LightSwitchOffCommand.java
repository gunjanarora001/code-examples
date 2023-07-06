package command;

public class LightSwitchOffCommand implements Command {
    private Light light;

    public LightSwitchOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}