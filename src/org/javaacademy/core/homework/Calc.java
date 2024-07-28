package org.javaacademy.core.homework;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Необходимо написать калькулятор. Алгоритм:
    //1. Вывести на экран: Введите первое число
    //2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
    //3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
    //4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
    //4. Вывести на экран: Введите второе число
    //5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
    //6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
    //Если знак операции не относится к перечисленным выше, вывести - "Ошибка"

    System.out.println("Введите первое число");
    double number1 = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
    String operand = scanner.nextLine();
    System.out.println("Введите второе число");
    double number2 = scanner.nextDouble();

    switch (operand) {
      case "+":
        System.out.println(number1 + number2);
        break;
      case "-":
        System.out.println(number1 - number2);
        break;
      case "*":
        System.out.println(number1 * number2);
        break;
      case "/":
        if (number2 == 0) {
          System.out.println("Деление на ноль запрещено!");
        } else {
          System.out.println(number1 / number2);
        }
        break;
      default: {
        System.out.println("Ошибка");
      }
    }

    scanner.close();
  }
}
