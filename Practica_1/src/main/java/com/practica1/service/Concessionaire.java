package com.practica1.service;

import com.practica1.model.Motorcycle;
import com.practica1.model.Vehicle;

import java.util.*;

public class Concessionaire {
    private List<Vehicle> vehicles;
    private Map<String,Vehicle> vehiclesByLicensePlate;
    private Set<String> uniqueVehicleBrands;

    public Concessionaire() {
        this.vehicles = new ArrayList<>();
        this.vehiclesByLicensePlate = new HashMap<>();
        this.uniqueVehicleBrands = new HashSet<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        uniqueVehicleBrands.add(vehicle.getBrand());
        vehiclesByLicensePlate.put(vehicle.getBrand(), vehicle);
    }

    public Vehicle findVehicleByLicensePlate(String licensePlate){
        return vehiclesByLicensePlate.get(licensePlate);
    }

    public Set<String> getAllLicensePlates(){
        return vehiclesByLicensePlate.keySet();
    }

    public List<Vehicle> filterByType(Class<?> type){
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle: vehicles){
            if(type.isInstance(vehicle)){
                result.add(vehicle);
            }
        }
        return result;
    }

    public void deleteByLicensePlate(String licensePlate) {
        Vehicle vehicle = vehiclesByLicensePlate.remove(licensePlate);
        if (vehicle != null) {
            vehicles.remove(vehicle);
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
