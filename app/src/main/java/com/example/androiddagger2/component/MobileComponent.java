package com.example.androiddagger2.component;

import com.example.androiddagger2.MainActivity;
import com.example.androiddagger2.model.Mobile;
import com.example.androiddagger2.modules.BatteryModule;
import com.example.androiddagger2.modules.SnapdragonModule;

import dagger.Component;

/**
 * Created by Minhajul Islam  on 15/03/2022.
 */

@Component(modules = {BatteryModule.class, SnapdragonModule.class})
public interface MobileComponent {
    //Mobile getMobile();
    void inject(MainActivity mainActivity);
}
