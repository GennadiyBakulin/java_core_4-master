package org.javaacademy.core.homework.homework4.ex4;

import org.javaacademy.core.homework.homework4.ex4.animal.AliveException;
import org.javaacademy.core.homework.homework4.ex4.animal.Elephant;
import org.javaacademy.core.homework.homework4.ex4.animal.Rabbit;
import org.javaacademy.core.homework.homework4.ex4.animal.Tiger;
import org.javaacademy.core.homework.homework4.ex4.animal.Wolf;

public class Runner {

    public static void main(String[] args) {
        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        try {
            rabbit.run();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
        try {
            wolf.attackingOnLiving(rabbit);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
        try {
            tiger.attackingOnLiving(wolf);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
        try {
            tiger.attackingOnLiving(elephant);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
        try {
            elephant.run();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
        try {
            rabbit.run();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
    }
}
