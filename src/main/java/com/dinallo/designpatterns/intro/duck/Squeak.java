package com.dinallo.designpatterns.intro.duck;

public class Squeak implements QuackBehavior{

    @Override
    public String quack() {
        return "Squeak";
    }
}
