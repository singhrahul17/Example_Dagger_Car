package com.example.example_dagger_car.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {
    }

    void setRemoteListener(Car car) {
        Log.d("Car", "setRemoteListener called ");
    }
}
