package com.dinallo.designpatterns.intro.duck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyRocketPoweredTest {

    Duck duck;

    @BeforeEach
    void setUp() {
        duck = new ModelDuck();
    }

    @Test
    void shouldNotFly() {
        String fly = duck.performFly();
        assertEquals("I can't fly!", fly);
    }

    @Test
    void shouldFly() {
        duck.setFlyBehavior(new FlyRocketPowered());
        String fly = duck.performFly();
        assertEquals("I'm flying with a rocket!", fly);
    }

}