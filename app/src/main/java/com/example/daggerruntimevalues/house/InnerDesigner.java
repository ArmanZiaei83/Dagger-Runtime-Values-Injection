package com.example.daggerruntimevalues.house;

public class InnerDesigner implements Designer{
    String name;
    int experience;

    @Override
    public void setDesignerName(String name) {
        this.name = name;
    }

    @Override
    public void setDesignerYearOfExperience(int experience) {
        this.experience = experience;
    }
    
    public InnerDesigner(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}
