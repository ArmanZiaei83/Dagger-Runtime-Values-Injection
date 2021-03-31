package com.example.daggerruntimevalues.house;

import javax.inject.Inject;

public class Builder implements Engineer {

    String name;
    int age;

    @Override
    public void setEngineerName() {
        System.out.println("Engineer Name : " + name);
    }

    @Override
    public void setEngineerAge() {
        System.out.println("Engineer Age : " + age);
    }

    public Builder(String name, int age) {
        this.name = name;
        this.age = age;

        setEngineerAge();
        setEngineerName();
    }
}
