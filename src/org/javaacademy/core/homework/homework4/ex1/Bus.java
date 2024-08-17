package org.javaacademy.core.homework.homework4.ex1;

public class Bus extends Car {

  private int countPassengers;

  public Bus(double width, double height, double length) {
    super(width, height, length);
  }

  public int getCountPassengers() {
    return countPassengers;
  }

  public void setCountPassengers(int countPassengers) {
    this.countPassengers = countPassengers;
  }
}
