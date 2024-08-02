package org.javaacademy.core.homework.homework2;

import org.javaacademy.core.homework.homework2.office.Boss;
import org.javaacademy.core.homework.homework2.office.Manager;
import org.javaacademy.core.homework.homework2.office.Office;
import org.javaacademy.core.homework.homework2.office.Secretary;
import org.javaacademy.core.homework.homework2.office.Security;

public class Runner {

  public static void main(String[] args) {
    Boss boss = new Boss("Петр Николаевич");
    Manager manager = new Manager("Володя");
    Security security = new Security("Петрович");
    Secretary secretary = new Secretary();
    Office office = new Office(boss, manager, secretary, security);
    office.workingDay();
  }
}
