package com.example.daggerruntimevalues.house;

public class InnerDesigner implements Designer{
    String name;
    int experience;

    @Override
    public void setDesignerName() {
        System.out.println("Designer Name : " + name);
    }

    @Override
    public void setDesignerYearOfExperience() {
        System.out.println("Designer Experience : " + experience);
    }

    public InnerDesigner(String name, int experience) {
        this.name = name;
        this.experience = experience;

       setDesignerName();
       setDesignerYearOfExperience();
    }
}
