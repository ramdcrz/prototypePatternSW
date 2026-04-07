package src.labSeatwork6;

public interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
    String getType();
}