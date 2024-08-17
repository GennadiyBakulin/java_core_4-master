package org.javaacademy.core.homework.homework4.ex4.animal;

public class Rabbit extends Herbivore {

  public Rabbit(double weight) {
    super(weight);
  }

  @Override
  public void run() throws AliveException {
    super.run();
    System.out.println("кролик быстро бежит");
  }
}
