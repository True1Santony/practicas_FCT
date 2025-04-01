package base;

import model.Car;
import model.FuelType;
import model.Motorcycle;
import model.Vehicle;

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