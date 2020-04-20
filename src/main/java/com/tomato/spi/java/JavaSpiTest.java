package com.tomato.spi.java;

import java.util.ServiceLoader;

/**
 * Description:
 *
 * @author: caoyintong
 * Version: 1.0
 * Create Date Time: 2020-04-15 15:35.
 * Update Date Time:
 */
public class JavaSpiTest {

    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        serviceLoader.forEach(Robot::sayHello);
    }
}
