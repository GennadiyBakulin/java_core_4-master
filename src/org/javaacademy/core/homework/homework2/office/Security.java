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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Security security = (Security) o;
    return name.equals(security.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return "Security{" +
        "name='" + name + '\'' +
        '}';
  }
}
