package com.example.androiddagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Minhajul Islam  on 16/03/2022.
 */
public class Snapdragon implements Processor {
    @Inject
    public Snapdragon() {
        Log.i("MyMobile", "Snapdragon: ");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "Snapdragon start: ");
    }
}
