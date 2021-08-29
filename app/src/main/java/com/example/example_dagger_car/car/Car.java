package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private Engine mEngine;
    private Wheels mWheels;

    // Constructor injection
    @Inject
    public Car(Engine mEngine, Wheels mWheels) {
        //Log.d("Car", "Car: ");
        this.mEngine = mEngine;
        this.mWheels = mWheels;
    }

    public void driving() {
        mWheels.createWheels();
        mEngine.start();
        Log.d("Car", "driving... ");
    }

    @Inject
    void enableRemote(Remote remote) {
        remote.setRemoteListener(this);
    }
}
