package com.dinallo.designpatterns.strategy.duck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MallardDuckTest {

    Duck duck;

    @BeforeEach
    void setUp() {
        duck = new MallardDuck();
    }

    @Test
    void shouldDisplay() {
        String display =  duck.display();
        assertEquals("I'm a real Mallard Duck!", display);

    }

    @Test
    void shouldSwim() {
        String swim = duck.swim();
        assertEquals("All ducks float, even decoys", swim);
    }

    @Test
    void shouldFly() {
        String fly = duck.performFly();
        assertEquals("I'm flying!", fly);
    }

    @Test
    void shouldQuack() {
        String quack = duck.performQuack();
        assertEquals("Quack", quack);
    }
}