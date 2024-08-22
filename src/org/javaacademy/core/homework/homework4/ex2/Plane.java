package org.javaacademy.core.homework.homework4.ex2;

public class Plane implements Fly {

    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("пассажиров в самолете меньше 0");
        }
        System.out.println("самолет летит");
    }
}
