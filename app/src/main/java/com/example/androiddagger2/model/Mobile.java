package com.example.androiddagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Minhajul Islam  on 15/03/2022.
 */
public class Mobile {
//    field injection
//    @Inject
//    Battery battery;
    private Battery battery;
    private Processor processor;

    //constructor injection
    @Inject
    public Mobile(Battery battery,Processor processor){
        this.battery = battery;
        this.processor = processor;
        Log.i("MyMobile", "Mobile: ");
    }

    public void run(){
        processor.start();
        Log.i("MyMobile", "Mobile run: ");
    }

    //method injection
    //@Inject
    public void connectCharger(Charger charger){
        charger.setCharger(this);
    }
}
