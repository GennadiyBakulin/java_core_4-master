package org.javaacademy.core.homework.homework4.ex4.animal;

public abstract class Herbivore extends Alive {

    public Herbivore(double weight) {
        super(weight);
    }

    public void run() throws AliveException {
        if (!this.isAlive()) {
            throw new AliveException("Животное не может бегать");
        }
    }
}
