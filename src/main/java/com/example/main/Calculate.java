package com.example.main;

import io.micronaut.context.annotation.DefaultImplementation;

// TODO: Why is the following annotation not needed?
//@DefaultImplementation(DefaultMyInterface.class)
public interface Calculate {
    int doSomething();
}
