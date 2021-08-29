package com.example.example_dagger_car.dagger;

import com.example.example_dagger_car.car.DieselEngine;
import com.example.example_dagger_car.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    @Provides
    static Engine provideEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }
}
