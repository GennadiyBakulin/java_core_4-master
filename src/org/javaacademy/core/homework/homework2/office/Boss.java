package org.javaacademy.core.homework.homework2.office;

public class Boss {

    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void customizeManager(Manager manager) {
        System.out.printf("%s быстрее!\n", manager.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Boss boss = (Boss) o;
        return name.equals(boss.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                '}';
    }
}
