package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    private Rim rim;
    private Tyre tyre;

    // Suppose this is a thiry party library and we do not have access to its constructor.
    public Wheels(Rim rim, Tyre tyre) {
        this.rim = rim;
        this.tyre = tyre;
    }

    void createWheels() {
        rim.createRim();
        tyre.inflate();
        Log.d("Car", "Wheels created...");
    }
}
