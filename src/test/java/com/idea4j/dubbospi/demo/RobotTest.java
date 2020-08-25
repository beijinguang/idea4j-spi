package com.idea4j.dubbospi.demo;


import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class RobotTest {

    @Test
    public void sayHello() {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);

        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
        Robot optimusprime = extensionLoader.getExtension("optimusPrime");
        optimusprime.sayHello();

    }
}