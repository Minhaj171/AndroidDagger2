package com.example.androiddagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Minhajul Islam  on 16/03/2022.
 */
public class MediaTek  implements Processor {

    @Inject
    public MediaTek() {
        Log.i("MyMobile", "MediaTek : ");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "MediaTek start: ");
    }
}
