package com.example.daggerruntimevalues.house;

import javax.inject.Inject;

public class House {

    Engineer engineer;
    Designer designer;

    @Inject
    public House(Engineer engineer, Designer designer) {
        this.engineer = engineer;
        this.designer = designer;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public Designer getDesigner() {
        return designer;
    }

    public void setDesigner(Designer designer) {
        this.designer = designer;
    }

    public void buildTheHouse(){
        System.out.println("House Has Been Built");
    }
}
