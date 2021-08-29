package com.example.example_dagger_car.dagger;

import com.example.example_dagger_car.MainActivity;
import com.example.example_dagger_car.car.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);     // Method name need not be 'inject()', but its naming makes sense here

}
