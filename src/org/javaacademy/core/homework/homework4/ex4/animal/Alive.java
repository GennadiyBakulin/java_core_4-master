package org.javaacademy.core.homework.homework4.ex4.animal;

public abstract class Alive {

  private boolean isAlive;
  private double weight;

  public Alive(double weight) {
    this.weight = weight;
    isAlive = true;
  }

  public void die() {
    isAlive = false;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public void setAlive(boolean alive) {
    isAlive = alive;
  }
}
