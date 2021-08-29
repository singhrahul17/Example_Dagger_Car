package com.example.example_dagger_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.example_dagger_car.car.Car;
import com.example.example_dagger_car.dagger.CarComponent;
import com.example.example_dagger_car.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();

        car = carComponent.getCar();
    }
}