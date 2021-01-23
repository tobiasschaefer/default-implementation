package com.example.main;

import javax.inject.Singleton;

@Singleton
// class has "package" visibilty
class DefaultCalculate implements Calculate {
    @Override
    public int doSomething() {
        return 0;
    }
}
