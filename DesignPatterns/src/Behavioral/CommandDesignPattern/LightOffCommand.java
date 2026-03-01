package Behavioral.CommandDesignPattern;

public class LightOffCommand implements Command{

    private Light light;

    LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
