package org.javaacademy.core.homework.homework3.ex2.phone;

import java.util.Arrays;

public class Iphone extends Phone {

  public void printInfoOfProcessors() {
    System.out.println("Processors: {" + Arrays.toString(this.getProcessors()) + "}");
  }
}
