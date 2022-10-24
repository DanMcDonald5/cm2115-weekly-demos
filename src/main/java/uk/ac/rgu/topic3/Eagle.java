package uk.ac.rgu.topic3;

public class Eagle extends Bird implements CanFly, IsPredator {

    public Eagle(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fly() {
        System.out.println("eagle is flying");
        // TODO Auto-generated method stub
        
    }
    
}
