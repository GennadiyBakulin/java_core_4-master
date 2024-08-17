package org.javaacademy.core.homework.homework4.ex1;

public class PassengerCar extends Car {

  private boolean isCruiseControl;

  public PassengerCar(double width, double height, double length) {
    super(width, height, length);
  }

  public boolean isCruiseControl() {
    return isCruiseControl;
  }

  public void setCruiseControl(boolean cruiseControl) {
    isCruiseControl = cruiseControl;
  }
}
