package uk.ac.rgu.topic3;

public class Horse extends Animal {
    

    public Horse(String name){
        super(name);
    }

    public final void trot(){
        System.out.println(this.name + " is Trotting");
    }

    public String makeSound(){
        return this.name + " neigh";
    }
}
