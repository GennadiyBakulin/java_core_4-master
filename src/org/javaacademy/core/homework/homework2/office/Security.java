package org.javaacademy.core.homework.homework2.office;

public class Security {

  private String name;

  public Security(String name) {
    this.name = name;
  }

  public void askPayment() {
    System.out.println("Прошу выдать мне аванс!");
  }

  public String getName() {
    return name;
  }
}
