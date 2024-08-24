package org.javaacademy.core.homework.homework5.ex2.computer;

import org.javaacademy.core.homework.homework5.ex2.user.User;

public class Computer {
    private User user;

    public void inputUser(User user) {
        this.user = user;
    }

    public void outputUser() {
        this.user = null;
    }

    public void sendMessage(String message) {
        System.out.printf("сообщение: %s\n", message);
    }

    public User getUser() {
        return user;
    }
}
