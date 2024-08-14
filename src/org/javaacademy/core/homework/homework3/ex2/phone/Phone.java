package org.javaacademy.core.homework.homework3.ex2.phone;

import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Camera;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Case;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Processor;

public abstract class Phone {

  protected Processor[] processors;
  protected Camera camera;
  protected Case phoneCase;

  public void photographing() {
    camera.photographing();
  }
}
