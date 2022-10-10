package com.dinallo.designpatterns.into.duck;

public class Quack implements QuackBehavior{

    @Override
    public String quack() {
        return "Quack";
    }
}
