package com.example.daggerruntimevalues.Dagger;

import com.example.daggerruntimevalues.MainActivity;
import com.example.daggerruntimevalues.house.House;

import dagger.Component;

@Component(modules = HouseModule.class)
public interface HouseCompnent {
    void inject(MainActivity mainActivity);
}
