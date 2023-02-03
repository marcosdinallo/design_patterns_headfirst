package com.dinallo.designpatterns.strategy.duck;

public class Squeak implements QuackBehavior{

    @Override
    public String quack() {
        return "Squeak";
    }
}
