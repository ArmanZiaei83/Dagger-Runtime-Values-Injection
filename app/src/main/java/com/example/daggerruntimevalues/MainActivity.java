package com.example.daggerruntimevalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerruntimevalues.Dagger.DaggerHouseCompnent;
import com.example.daggerruntimevalues.Dagger.HouseCompnent;
import com.example.daggerruntimevalues.Dagger.HouseModule;
import com.example.daggerruntimevalues.house.House;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    House house;

    HouseCompnent compnent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compnent = DaggerHouseCompnent.builder().houseModule(new HouseModule("Ghodsi Manesh"
                , "Nina", 35 , 5)).build();

        compnent.inject(this);
        house.buildTheHouse();

    }
}