package org.javaacademy.core.homework.homework2.office;

public class Office {

  private Boss boss;
  private Manager manager;
  private Secretary secretary;
  private Security security;

  public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
    this.boss = boss;
    this.manager = manager;
    this.secretary = secretary;
    this.security = security;
  }

  public void workingDay() {
    boss.customizeManager(manager);
    manager.shout();
    security.askPayment();
    secretary.ask(boss, manager, security);
  }
}
