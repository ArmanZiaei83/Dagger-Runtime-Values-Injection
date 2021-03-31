package com.example.daggerruntimevalues.Dagger;

import android.os.Build;

import com.example.daggerruntimevalues.house.Builder;
import com.example.daggerruntimevalues.house.Designer;
import com.example.daggerruntimevalues.house.Engineer;
import com.example.daggerruntimevalues.house.InnerDesigner;

import dagger.Module;
import dagger.Provides;

@Module
public class HouseModule {

    String engineerName;
    String designerName;

    int engieerAge;
    int designerExperience;

    public HouseModule(String engineerName, String designerName, int engieerAge, int designerExperience) {
        this.engineerName = engineerName;
        this.designerName = designerName;
        this.engieerAge = engieerAge;
        this.designerExperience = designerExperience;
    }

    @Provides
    Engineer provideEngineer(){
        return new Builder(engineerName , engieerAge);
    }

    @Provides
    Designer provideDesigner(){
        return new InnerDesigner(designerName , designerExperience);
    }
}
