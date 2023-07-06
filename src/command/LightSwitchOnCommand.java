package command;

public class LightSwitchOnCommand implements Command {
    private Light light;

    public LightSwitchOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}