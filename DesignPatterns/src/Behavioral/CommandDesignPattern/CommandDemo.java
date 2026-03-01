package Behavioral.CommandDesignPattern;

/*
    Command Design Pattern is a Behavioral design pattern which encapsulate request as an object and execute it later,
    It also decouples invoker from the receiver allowing flexible execution of operations
    Supports features like undo/redo, logging, and queuing of requests

    Let's take the example of Smart home system, where we want to implement the Smart light which have the turn on and off light commands.
*/

public class CommandDemo {

    public static void main(String[] args) {

        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.pressUndo();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
        remoteControl.pressUndo();
    }
}
