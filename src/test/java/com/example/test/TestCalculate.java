package com.example.test;

import com.example.main.Calculate;
import io.micronaut.context.annotation.Replaces;

import javax.inject.Singleton;

@Replaces(Calculate.class)
@Singleton
class TestCalculate implements Calculate {
    @Override
    public int doSomething() {
        return 1;
    }
}
