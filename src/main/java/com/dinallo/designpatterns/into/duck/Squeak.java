package com.dinallo.designpatterns.into.duck;

public class Squeak implements QuackBehavior{

    @Override
    public String quack() {
        return "Squeak";
    }
}
