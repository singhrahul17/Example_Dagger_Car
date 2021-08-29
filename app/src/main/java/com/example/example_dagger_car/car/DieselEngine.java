package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d("Car", "Diesel engine started");
    }
}
