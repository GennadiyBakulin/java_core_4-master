package org.javaacademy.core.homework.homework5.ex2.spy;

import org.javaacademy.core.homework.homework5.ex2.computer.Computer;
import org.javaacademy.core.homework.homework5.ex2.user.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {
    private final static String PATH_TO_FILE = "logs\\comp.log";
    private final Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void inputUser(User user) {
        String log = String.format("Пользователь %s вошел\n", user.getName());
        writeToFile(log);
        this.computer.inputUser(user);
    }

    @Override
    public void outputUser() {
        String log = "Пользователь вышел\n";
        writeToFile(log);
        this.computer.outputUser();
    }

    @Override
    public void sendMessage(String message) {
        String log = String.format("Пользователь %s отправил сообщение %s\n",
                computer.getUser().getName(), message);
        writeToFile(log);
        this.computer.sendMessage(message);
    }

    private void writeToFile(String log) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_TO_FILE, true))) {
            bw.write(log);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
