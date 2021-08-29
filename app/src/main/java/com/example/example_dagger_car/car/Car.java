package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Engine mEngine, Wheels mWheels) {
        this.mEngine = mEngine;
        this.mWheels = mWheels;
    }

    void driving() {
        Log.d("Car", "driving... ");
    }
}
