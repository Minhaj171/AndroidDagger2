package com.example.androiddagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Minhajul Islam  on 16/03/2022.
 */
public class Charger {

    @Inject
    public Charger() {
    }

    void setCharger(Mobile mobile){
        Log.i("MyMobile", "setCharger: ");
    }
}
