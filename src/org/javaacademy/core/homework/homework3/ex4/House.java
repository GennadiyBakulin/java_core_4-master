package org.javaacademy.core.homework.homework3.ex4;

public class House {

    private String street;
    private int house;

    public House(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "House{" +
                "street: " + street + '\'' +
                ", house: " + house +
                '}';
    }
}
