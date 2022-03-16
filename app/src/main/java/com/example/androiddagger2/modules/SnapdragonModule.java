package com.example.androiddagger2.modules;

import com.example.androiddagger2.model.Processor;
import com.example.androiddagger2.model.Snapdragon;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Minhajul Islam  on 16/03/2022.
 */
@Module
public class SnapdragonModule {

    @Provides
    Processor getProcessor(Snapdragon snapdragon){
        return snapdragon;
    }

}
