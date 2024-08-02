package org.javaacademy.core.homework.homework2.office;

public class Manager {

  private String name;

  public Manager(String name) {
    this.name = name;
  }

  public void shout() {
    System.out.println("Я ничего не успеваю, помогите!");
  }

  public String getName() {
    return name;
  }
}
