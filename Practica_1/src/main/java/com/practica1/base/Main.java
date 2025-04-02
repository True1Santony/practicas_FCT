package com.practica1.base;

import com.practica1.model.Car;
import com.practica1.model.FuelType;
import com.practica1.model.Motorcycle;
import com.practica1.model.Vehicle;
import com.practica1.service.Concessionaire;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Seat", "Ibiza", 2000, FuelType.GASOLINE,"MA1234ZZ",5);

        executeMethods(car);

        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2005, FuelType.GASOLINE,"1234ABC", 600);

        executeMethods(motorcycle);

        List<Vehicle> vehicles = List.of(car,motorcycle);

        for (Vehicle vehicle1: vehicles){
            vehicle1.displayInformation();
        }

        System.out.println("*************Tarea PRC-12*******************");

        Vehicle motorcycle1 = new Motorcycle("Yamaha", "YBR", 2010, FuelType.GASOLINE,"4321CBA", 125);
        Vehicle car1 = new Car("Volkswage", "Golf", 2012, FuelType.DIESEL,"3884HQE",3);

        //En el main, usar los métodos para añadir vehiculos de distinto tipo.
        Concessionaire concessionaireService = new Concessionaire();

        concessionaireService.addVehicle(car);
        concessionaireService.addVehicle(car1);
        concessionaireService.addVehicle(motorcycle);
        concessionaireService.addVehicle(motorcycle1);

        //Mostrar la informacion de los vehiculos utilizando los metodos implementados en el punto anterior.
        for (String licencePlate : concessionaireService.getAllLicensePlates()){
            concessionaireService
                    .findVehicleByLicensePlate(licencePlate)
                    .displayInformation();
        }

        //Usar TreeSet para ordenar por marca y volver a mostrar todos los vehiculos ordenados.
        System.out.println("********************************TreeSet por Marca de vehículo");

        Set<Vehicle> sortedVehicles = new TreeSet<>((v1, v2) -> v1.getBrand().compareTo(v2.getBrand()));
        sortedVehicles.addAll(concessionaireService.getVehicles());

        for (Vehicle vehicle : sortedVehicles) {
            vehicle.displayInformation();
        }

    }

    private static void executeMethods(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.brake();
        vehicle.displayInformation();
    }

}