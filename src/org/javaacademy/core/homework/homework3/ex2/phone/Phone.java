package org.javaacademy.core.homework.homework3.ex2.phone;

import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Camera;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.PhoneCase;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Processor;

public class Phone {

  protected Processor[] processors;
  protected Camera camera;
  protected PhoneCase phoneCase;

  protected void photographing() {
    camera.photographing();
  }
}
