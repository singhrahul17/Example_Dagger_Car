package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d("Car", "Petrol engine started");
    }
}
