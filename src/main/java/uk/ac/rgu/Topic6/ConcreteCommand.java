package uk.ac.rgu.Topic6;

public class ConcreteCommand implements Command {

    private Target instance;

    public ConcreteCommand(Target instance){
        this.instance = instance;
    }
    private Target target;

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        
    }
    
}
