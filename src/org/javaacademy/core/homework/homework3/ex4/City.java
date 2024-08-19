package org.javaacademy.core.homework.homework3.ex4;

import java.util.Arrays;

public class City {

    private String name;
    private final House[] houses;

    private City(House... houses) {
        this.houses = houses;
    }

    public City(String name, House... houses) {
        this(houses);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        House[] clone = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            clone[i] = new House(houses[i].getStreet(), houses[i].getHouse());
        }
        return clone;
    }

    @Override
    public String toString() {
        return "City{" +
                "name: " + name + '\'' +
                ", " + Arrays.toString(houses) +
                '}';
    }
}
