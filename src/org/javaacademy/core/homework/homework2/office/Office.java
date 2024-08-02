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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Office office = (Office) o;
    return boss.equals(office.boss) && manager.equals(office.manager) && secretary.equals(
        office.secretary) && security.equals(office.security);
  }

  @Override
  public int hashCode() {
    int result = boss.hashCode();
    result = 31 * result + manager.hashCode();
    result = 31 * result + secretary.hashCode();
    result = 31 * result + security.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Office{" +
        "boss=" + boss +
        ", manager=" + manager +
        ", secretary=" + secretary +
        ", security=" + security +
        '}';
  }
}
