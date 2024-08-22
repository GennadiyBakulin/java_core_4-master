package org.javaacademy.core.homework.homework4.ex4.animal;

public abstract class Predator extends Alive {

    protected Predator(double weight) {
        super(weight);
    }

    public void attackingOnLiving(Alive alive) throws AliveException {
        if (!this.isAlive()) {
            throw new AliveException("Животное не может нападать");
        }
        if (this.getWeight() < alive.getWeight()) {
            this.die();
        } else {
            this.setWeight(this.getWeight() + alive.getWeight() / 3);
            alive.die();
        }
    }
}
