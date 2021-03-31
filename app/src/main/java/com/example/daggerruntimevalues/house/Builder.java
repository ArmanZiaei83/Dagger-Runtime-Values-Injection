package com.example.daggerruntimevalues.house;

import javax.inject.Inject;

public class Builder implements Engineer {

    String name;
    int age;

    @Override
    public void setEngineerName(String name) {
        this.name = name;
    }

    @Override
    public void setEngineerAge(int age) {
        this.age = age;
    }

    public Builder(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
