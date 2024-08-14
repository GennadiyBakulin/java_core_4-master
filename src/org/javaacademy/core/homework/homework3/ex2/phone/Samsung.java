package org.javaacademy.core.homework.homework3.ex2.phone;

import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Camera;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Case;
import org.javaacademy.core.homework.homework3.ex2.phoneaccessories.Processor;

public class Samsung extends Phone {

  public Processor[] getProcessors() {
    return processors;
  }

  public void setProcessors(Processor[] processors) {
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
