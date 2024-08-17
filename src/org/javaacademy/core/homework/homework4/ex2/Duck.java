package org.javaacademy.core.homework.homework4.ex2;

public class Duck implements Fly {

  private boolean isInjured;

  public void setInjured(boolean injured) {
    isInjured = injured;
  }

  @Override
  public void fly() throws FlyException {
    if (isInjured) {
      throw new FlyException("утка ранена");
    }
    System.out.println("утка летит");
  }
}
