package com.practica1.base;

import com.practica1.model.Car;
import com.practica1.model.FuelType;
import com.practica1.model.Motorcycle;
import com.practica1.model.Vehicle;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Seat", "Ibiza", 2000, FuelType.GASOLINE,5);

        executeMethods(car);

        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2005, FuelType.GASOLINE, 600);

        executeMethods(motorcycle);

        List<Vehicle> vehicles = List.of(car,motorcycle);

        for (Vehicle vehicle1: vehicles){
            vehicle1.displayInformation();
        }

    }

    private static void executeMethods(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.brake();
        vehicle.displayInformation();
    }

}