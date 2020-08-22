package com.idea4j.spi.demo.impl;

import com.idea4j.spi.demo.Log;

public class Log4j implements Log {
    @Override
    public void log(String log) {
        System.out.println("Log4j execute ...");
    }
}
