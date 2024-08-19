package org.javaacademy.core.homework.homework2;

import org.javaacademy.core.homework.homework2.office.*;

public class Runner {

    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office();
        office.setBoss(boss);
        office.setManager(manager);
        office.setSecretary(secretary);
        office.setSecurity(security);
        office.workingDay();
    }
}
