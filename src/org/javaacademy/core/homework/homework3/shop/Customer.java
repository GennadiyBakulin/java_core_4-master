package org.javaacademy.core.homework.homework3.shop;

/**
 * Покупатель
 */
public class Customer {

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    void checkShop(Shop shop) {
        //ПОМЕНЯТЬ ЗДЕСЬ ВЫРАЖЕНИЕ
        if (shop.isClearFloor() && shop.getCountWorkers() > 2
                || shop.isClearFloor() && shop.isWorkersHasBadge()
                || shop.getCountWorkers() > 2 && shop.isWorkersHasBadge()) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
