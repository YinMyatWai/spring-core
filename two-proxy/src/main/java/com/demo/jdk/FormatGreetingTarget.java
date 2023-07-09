package com.demo.jdk;

public class FormatGreetingTarget implements Greeting{

    @Override
    public String greet(String name) {
        return "Hello!"+name;
    }
}
