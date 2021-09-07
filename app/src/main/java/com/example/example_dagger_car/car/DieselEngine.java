package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    // Now have a variable that needs to be provided at run time
    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("Car", "Diesel engine started with horse power : "+horsePower);
    }
}
