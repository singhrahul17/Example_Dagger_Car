package com.example.example_dagger_car.dagger;

import com.example.example_dagger_car.car.Engine;
import com.example.example_dagger_car.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);
}
