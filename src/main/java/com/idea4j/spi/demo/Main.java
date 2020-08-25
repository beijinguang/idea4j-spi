package com.idea4j.spi.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Log next = iterator.next();
            next.log("com.idea4j.spi.demo.Log");
        }
    }
}
