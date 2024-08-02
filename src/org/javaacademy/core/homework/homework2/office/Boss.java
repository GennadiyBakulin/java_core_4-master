package org.javaacademy.core.homework.homework2.office;

public class Boss {

  private String name;

  public Boss(String name) {
    this.name = name;
  }

  public void customizeManager(Manager manager) {
    System.out.printf("%s быстрее!\n", manager.getName());
  }

  public String getName() {
    return name;
  }
}
