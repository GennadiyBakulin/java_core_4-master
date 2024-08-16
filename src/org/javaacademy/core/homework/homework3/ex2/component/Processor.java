package org.javaacademy.core.homework.homework3.ex2.component;

public class Processor {

  private int numberOfCalculationsPerSecond;

  public Processor(int numberOfCalculationsPerSecond) {
    this.numberOfCalculationsPerSecond = numberOfCalculationsPerSecond;
  }

  public int getNumberOfCalculationsPerSecond() {
    return numberOfCalculationsPerSecond;
  }

  public void setNumberOfCalculationsPerSecond(int numberOfCalculationsPerSecond) {
    this.numberOfCalculationsPerSecond = numberOfCalculationsPerSecond;
  }

  @Override
  public String toString() {
    return "Processor{" +
        "numberOfCalculationsPerSecond=" + numberOfCalculationsPerSecond +
        '}';
  }
}
