package com.example.example_dagger_car.dagger;

import com.example.example_dagger_car.car.Rim;
import com.example.example_dagger_car.car.Tyre;
import com.example.example_dagger_car.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelModule {

    @Provides
    static Rim provideRim() {
        return new Rim();
    }

    @Provides
    static Tyre provideTyre() {
        return new Tyre();
    }

    @Provides
    static Wheels provideWheels(Rim rim, Tyre tyre) {
        return new Wheels(rim, tyre);
    }
}
