package com.example.test;

import com.example.main.Calculate;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class ReplaceTest {

    @Inject
    Calculate calculate;

    @Test
    void doSomething() {
        assertEquals(1, calculate.doSomething());
    }
}
