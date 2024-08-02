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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Manager manager = (Manager) o;
    return name.equals(manager.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return "Manager{" +
        "name='" + name + '\'' +
        '}';
  }
}
