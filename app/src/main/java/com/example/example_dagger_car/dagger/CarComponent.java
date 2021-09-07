package com.example.example_dagger_car.dagger;

import com.example.example_dagger_car.MainActivity;
import com.example.example_dagger_car.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = {WheelModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);     // Method name need not be 'inject()', but its naming makes sense here

    // Builder method for Petrol engine
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power")int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();

    }
}
