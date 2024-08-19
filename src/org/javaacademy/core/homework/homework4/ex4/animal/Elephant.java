package org.javaacademy.core.homework.homework4.ex4.animal;

public class Elephant extends Herbivore {

    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() throws AliveException {
        super.run();
        System.out.println("слон медленно бежит");
    }
}
