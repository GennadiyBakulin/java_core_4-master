package org.javaacademy.core.homework.homework3.shop;

public class Runner {

  public static void main(String[] args) {
    //Задача: Тайный клуб покупателей
    //Сделать рефакторинг кода (т.е изменить код), таким образом, чтобы:
    //1. Магазин мог создаваться во всех классах любых пакетов
    //2. Атрибуты магазина и покупателя соответствовали правилам инкапсуляции
    //3. Сделать так, чтобы покупатель имел имя
    //4. Изменить метод Customer.checkShop так, чтобы при проверке магазина,
    //соблюдение двух из 3 условий свидетельствовали об успешном прохождении проверки:
    //- Пол чистый
    //- У работников есть бейджики
    //- Количество работников больше 2

    //Проверить здесь правильность написанного кода, создав покупателя, магазин и запустив проверку от покупателя
    Customer customer = new Customer("Иван");
    Shop shop1 = new Shop(true, true, 2);
    customer.checkShop(shop1);
    Shop shop2 = new Shop(true, false, 3);
    customer.checkShop(shop2);
    Shop shop3 = new Shop(false, true, 3);
    customer.checkShop(shop3);
    Shop shop4 = new Shop(false, false, 3);
    customer.checkShop(shop4);
  }
}
