package com.example.androiddagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Minhajul Islam  on 15/03/2022.
 */
public class Battery {
    private Cobalt cobalt;
    private Lithium lithium;

    public Battery(Cobalt cobalt, Lithium lithium){
        this.cobalt = cobalt;
        this.lithium = lithium;
        Log.i("MyMobile", "Battery: ");
    }
}
