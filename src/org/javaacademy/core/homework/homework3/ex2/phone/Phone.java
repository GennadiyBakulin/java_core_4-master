package org.javaacademy.core.homework.homework3.ex2.phone;

import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Camera;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Case;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Processor;

public abstract class Phone {

  private Processor[] processors;
  private Camera camera;
  protected Case phoneCase;

  public void photographing() {
    camera.photographing();
  }

  public Processor[] getProcessors() {
    return processors;
  }

  public void setProcessors(
      Processor[] processors) {
    this.processors = processors;
  }

  public Camera getCamera() {
    return camera;
  }

  public void setCamera(Camera camera) {
    this.camera = camera;
  }

  public Case getPhoneCase() {
    return phoneCase;
  }

  public void setPhoneCase(Case phoneCase) {
    this.phoneCase = phoneCase;
  }
}
