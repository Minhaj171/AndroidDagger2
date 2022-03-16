package com.example.androiddagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androiddagger2.component.DaggerMobileComponent;
import com.example.androiddagger2.component.MobileComponent;
import com.example.androiddagger2.model.Battery;
import com.example.androiddagger2.model.Mobile;
import com.example.androiddagger2.model.Processor;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Battery battery = new Battery();
//        Processor processor = new Processor();
//        Mobile mobile = new Mobile(battery, processor);
//        mobile.run();

//        MobileComponent mobileComponent = DaggerMobileComponent.create();
//        Mobile mobile = mobileComponent.getMobile();
//        mobile.run();

//        MobileComponent mobileComponent = DaggerMobileComponent.create();
//        mobileComponent.getMobile().run();

        MobileComponent mobileComponent = DaggerMobileComponent.create();
        mobileComponent.inject(this);
        mobile.run();

    }
}