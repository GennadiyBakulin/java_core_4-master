package org.javaacademy.core.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework1 {

  public static void main(String[] args) {
    ex2();
    System.out.println("___________________________________________");
    ex3();
    System.out.println("___________________________________________");
    ex4();
    System.out.println("___________________________________________");
    advanced();
  }

  public static void ex1() {
    //Открыть класс Calc, там задание!
  }

  public static void ex2() {
    //Дана строка
    String name = "     ПЕтРов Олег Иванович     ";

    //Необходимо
    //1. убрать лишние пробелы,
    //2. перевести текст в верхний регистр
    //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
    // Если содержит "ов " то печатаем на экран: Уважаемый {name}
    // В иных случаях печатаем на экран: Неизвестное лицо {name}

    name = name.trim().toUpperCase();

    if (name.contains("ова ".toUpperCase())) {
      System.out.println("Уважаемая " + name);
    } else if (name.contains("ов ".toUpperCase())) {
      System.out.println("Уважаемый " + name);
    } else {
      System.out.println("Неизвестное лицо " + name);
    }
  }

  public static void ex3() {
    //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
    //Количество топлива
    double fuel = 10;

    //Работоспособен или нет двигатель
    boolean isEngineWork = true;

    //Есть ли ошибки в компьютере (false - ошибок нет)
    boolean hasErrors = false;

    //Датчики давления шин
    boolean isWheelWork1 = true;
    boolean isWheelWork2 = true;
    boolean isWheelWork3 = true;
    boolean isWheelWork4 = true;

    //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
    // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
    //В ином случае, машина не должна запускаться
    if (
        fuel >= 10
            && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
            && !hasErrors
            && isEngineWork
    ) {
      System.out.println("Машина едет");
    } else {
      System.out.println("Машина не едет");
    }
  }

  public static void ex4() {
    //Работа на самостоятельное изучение функций класса String.
    //Заменить в строке 'this is' на 'those are',
    //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
    //Распечатать полученный индекс
    String simply = "this is simply. This is my favorite song.";

    simply = simply.replaceAll("this is", "those are");
    int index = simply.indexOf('o', simply.indexOf('o') + 1);

    System.out.println(index);
  }

  /**
   * Для продвинутых! Принимается только при использовании класса BigDecimal в расчетах.
   */
  public static void advanced() {
    //Задача №4
    //Компания Рога и Копыта производит мясные продукты.
    //Перечень производимых товаров :
    //Колбаса - стоимость(цена) 800 руб,
    //себестоимость при производстве меньше 1000 кг - 412руб,
    //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
    //себестоимость при производстве от 2000 - 404 руб

    //Ветчина - стоимость 350 руб
    //себестоимость при производстве - 275 руб

    //Шейка - стоимость 500 руб
    //себестоимость при производстве меньше 500кг - 311 руб
    //себестоимость при производстве больше или равно 500кг - 299 руб

    //Финансовые показатели
    //Доход компании считается как умножение стоимости на количество проданных кг
    //Расход компании считается как умношение себестоимости на количество проданных кг + миллион рублей
    //Прибыль до налогов считается как: доход - расход
    //Налоги считаются так:
    // прибыль до налогов больше 2_000_000, облагается ставкой 13%
    // прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
    // прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
    //пример расчета налогов для прибыли до налогов 2_500_000:
    //1_000_000 - налог 80_000 - по ставке 8%
    //1_000_000 - налог 100_000 - по ставке 10%
    //500_000 - 65_000 - по ставке 13%
    //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
    //Прибыль после налогов: прибыль до налогов - налог.

    //Необходимо создать универсальную систему расчетов прибыли после налогов,
    //Т.е на вход подаются данные по количеству произведенных продуктов
    // и печатается прибыль после налогов компании
    //Узнать прибыль после налогов, при продаже:
    //Колбасы 2000кг - это произведено и продано
    //Ветчины 8511кг - это произведено и продано
    //Шейки 6988кг - это произведено и продано

    int producedSausage = 2000;
    int producedHam = 8511;
    int producedNeck = 6988;

    calculationOfProfitAfterTaxes(producedSausage, producedHam, producedNeck);
  }

  private static void calculationOfProfitAfterTaxes(int producedSausage, int producedHam,
      int producedNeck) {
    //Стоимость колбасы
    BigDecimal priceSausage = BigDecimal.valueOf(800);
    //Стоимость ветчины
    BigDecimal priceHam = BigDecimal.valueOf(350);
    //Стоимость шейки
    BigDecimal priceNeck = BigDecimal.valueOf(500);
    //Расходы на колбасу
    BigDecimal expensesSausage;
    //Расходы на ветчину
    BigDecimal expensesHam;
    //Расходы на шейку
    BigDecimal expensesNeck;
    //Прибыль до налога
    BigDecimal profitBeforeTaxes;
    //Налог
    BigDecimal tax;
    //Прибыль после налога
    BigDecimal profitAfterTaxes;

    //Расчет общего дохода
    BigDecimal income = priceSausage
        .multiply(BigDecimal.valueOf(producedSausage))
        .add(priceHam.multiply(BigDecimal.valueOf(producedHam)))
        .add(priceNeck.multiply(BigDecimal.valueOf(producedNeck)));

    //Расчет расходов по типу продукции с учетом себестоимости
    expensesHam = BigDecimal.valueOf(275).multiply(BigDecimal.valueOf(producedHam));
    expensesNeck = (producedNeck < 500
        ? BigDecimal.valueOf(311)
        : BigDecimal.valueOf(299))
        .multiply(BigDecimal.valueOf(producedNeck));
    if (producedSausage < 1000) {
      expensesSausage = BigDecimal.valueOf(412)
          .multiply(BigDecimal.valueOf(producedSausage));
    } else if (producedSausage >= 2000) {
      expensesSausage = BigDecimal.valueOf(404)
          .multiply(BigDecimal.valueOf(producedSausage));
    } else {
      expensesSausage = BigDecimal.valueOf(408)
          .multiply(BigDecimal.valueOf(producedSausage));
    }

    //Расчет общего расхода
    BigDecimal expenses = expensesSausage.add(expensesHam).add(expensesNeck)
        .add(BigDecimal.valueOf(1_000_000));

    //Расчет общей прибыли до налога
    profitBeforeTaxes = income.subtract(expenses);

    //Расчет общего налога
    if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(1_000_000)) <= 0) {
      tax = profitBeforeTaxes.multiply(BigDecimal.valueOf(0.08))
          .setScale(2, RoundingMode.HALF_EVEN);
    } else {
      tax = BigDecimal.valueOf(1_000_000 * 0.08)
          .setScale(2, RoundingMode.HALF_EVEN);
    }

    if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(2_000_000)) <= 0) {
      tax = tax.add(profitBeforeTaxes.subtract(BigDecimal.valueOf(1_000_000))
          .multiply(BigDecimal.valueOf(0.1)));
    } else {
      tax = tax.add(BigDecimal.valueOf(1_000_000 * 0.1));
    }

    if (profitBeforeTaxes.compareTo(BigDecimal.valueOf(2_000_000)) > 0) {
      tax = tax.add(profitBeforeTaxes.subtract(BigDecimal.valueOf(2_000_000))
          .multiply(BigDecimal.valueOf(0.13)));
    }

    //Расчет прибыли после налога
    profitAfterTaxes = profitBeforeTaxes.subtract(tax);

    System.out.println(profitAfterTaxes);
  }
}
