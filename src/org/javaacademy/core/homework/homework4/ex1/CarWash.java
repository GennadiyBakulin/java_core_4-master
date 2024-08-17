package org.javaacademy.core.homework.homework4.ex1;

public class CarWash {

  public int washingCar(Car car) {
    car.setClean(true);
    if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
      return 4000;
    }
    return 2000;
  }

  public int washingCars(Car[] cars) {
    int cost = 0;
    for (Car car : cars) {
      cost += washingCar(car);
    }
    return cost;
  }
}
