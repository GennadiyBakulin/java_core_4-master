package org.javaacademy.core.homework.homework3.ex2.factory;

import org.javaacademy.core.homework.homework3.ex2.component.Camera;
import org.javaacademy.core.homework.homework3.ex2.component.Case;
import org.javaacademy.core.homework.homework3.ex2.component.Processor;
import org.javaacademy.core.homework.homework3.ex2.phone.Iphone;
import org.javaacademy.core.homework.homework3.ex2.phone.Phone;
import org.javaacademy.core.homework.homework3.ex2.phone.Samsung;

public class PhoneFactory {

    private PhoneFactory() {
    }

    public static Phone createPhone(TypePhone typePhone) {

        return switch (typePhone) {
            case IPHONE -> {
                Iphone iphone = new Iphone();
                iphone.setProcessors(new Processor[]{
                    new Processor(1000),
                    new Processor(1000)
                });
                iphone.setCamera(new Camera(8_000_000));
                iphone.setPhoneCase(new Case(60, 200, 10));
                yield iphone;
            }
            case SAMSUNG -> {
                Samsung samsung = new Samsung();
                samsung.setProcessors(new Processor[]{
                    new Processor(1500)
                });
                samsung.setCamera(new Camera(16_000_000));
                samsung.setPhoneCase(new Case(60, 200, 15));
                yield samsung;
            }
        };
    }
}
