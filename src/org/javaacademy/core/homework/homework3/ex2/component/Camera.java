package org.javaacademy.core.homework.homework3.ex2.component;

public class Camera {

    private int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public void photographing() {
        System.out.println("сделано фото");
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
