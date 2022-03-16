package com.example.androiddagger2.modules;

import com.example.androiddagger2.model.Battery;
import com.example.androiddagger2.model.Cobalt;
import com.example.androiddagger2.model.Lithium;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Minhajul Islam  on 16/03/2022.
 */
@Module
public class BatteryModule {
    @Provides
    Cobalt getCobalt(){
        return new Cobalt();
    }

    @Provides
    Lithium getLithium(){
        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }

    @Provides
    Battery getBattery(Lithium lithium, Cobalt cobalt){
        return new Battery(cobalt, lithium);
    }
}
