package org.javaacademy.core.homework.homework4.ex4.animal;

public class Tiger extends Predator {

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void attackingOnLiving(Alive alive) throws AliveException {
        if (!this.isAlive()) {
            throw new AliveException("Животное не может нападать");
        }
        if (this.getWeight() * 2 < alive.getWeight()) {
            this.die();
        } else {
            setWeight(this.getWeight() + alive.getWeight() / 3);
            alive.die();
        }
    }
}
