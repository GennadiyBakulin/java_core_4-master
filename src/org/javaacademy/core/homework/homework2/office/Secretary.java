package org.javaacademy.core.homework.homework2.office;

public class Secretary {

  public Secretary() {
  }

  public void ask(Boss boss, Manager manager, Security security) {
    System.out.printf("%s не волнуйтесь, %s все успеет. %s - подождите!\n",
        boss.getName(), manager.getName(), security.getName());
  }
}
