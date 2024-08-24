package org.javaacademy.core.homework.homework5.ex2;

import org.javaacademy.core.homework.homework5.ex2.computer.Computer;
import org.javaacademy.core.homework.homework5.ex2.spy.ComputerSpy;
import org.javaacademy.core.homework.homework5.ex2.user.User;

public class Runner {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Alexandr");
        Computer computer = new Computer();
        ComputerSpy spy = new ComputerSpy(computer);
        spy.inputUser(user1);
        spy.sendMessage("User1 сообщение!");
        spy.outputUser();
        spy.inputUser(user2);
        spy.sendMessage("User2 сообщение!");
        spy.outputUser();
    }
}
