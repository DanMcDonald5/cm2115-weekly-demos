package uk.ac.rgu.topic3;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Tweet";
    }
}
