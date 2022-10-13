package com.dinallo.designpatterns.intro.duck;

public class Quack implements QuackBehavior{

    @Override
    public String quack() {
        return "Quack";
    }
}
