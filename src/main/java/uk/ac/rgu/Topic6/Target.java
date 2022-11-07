package uk.ac.rgu.Topic6;

public class Target {
    private static Command[] commands = new Command[10];

    public void doSomething(){
        System.out.println("I'm doing something");

    }
    public static void main(String[] args){
        Target instance = new Target();

        Command doSomethingCommand = new ConcreteCommand(instance);
        commands[0] = doSomethingCommand;

        Computer pc = new Computer();

        commands[0] = 
        commands[1] = pc::turnOn;

    }
        

}
