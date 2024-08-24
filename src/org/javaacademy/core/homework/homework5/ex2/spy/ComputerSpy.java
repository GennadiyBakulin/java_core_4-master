package org.javaacademy.core.homework.homework5.ex2.spy;

import org.javaacademy.core.homework.homework5.ex2.computer.Computer;
import org.javaacademy.core.homework.homework5.ex2.user.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {
    private final static String PATH_TO_FILE = "comp.log";
    Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void inputUser(User user) {
        String log = String.format("Пользователь %s вошел\n", user.getName());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_TO_FILE, true))) {
            bw.write(log);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.computer.inputUser(user);
    }

    @Override
    public void outputUser() {
        String log = "Пользователь вышел\n";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_TO_FILE, true))) {
            bw.write(log);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.computer.outputUser();
    }

    @Override
    public void sendMessage(String message) {
        String log = String.format("Пользователь %s отправил сообщение %s\n",
                computer.getUser().getName(),
                message);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_TO_FILE, true))) {
            bw.write(log);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.computer.sendMessage(message);
    }
}
