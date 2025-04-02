package com.practica1.service;

import com.practica1.service.common.DuplicateLicensePlateException;
import com.practica1.service.common.EmptyLicensePlateException;
import com.practica1.service.common.TypeNotFoundException;
import com.practica1.service.common.VehicleNotFoundException;
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

    //addVehiculo: Si la matrícula ya está en el HashMap, lanzar excepción
    public void addVehicle(Vehicle vehicle) throws DuplicateLicensePlateException {
        if (vehiclesByLicensePlate.containsKey(vehicle.getLicensePlate())) {
            throw new DuplicateLicensePlateException(vehicle.getLicensePlate());
        }
        vehicles.add(vehicle);
        uniqueVehicleBrands.add(vehicle.getBrand());
        vehiclesByLicensePlate.put(vehicle.getLicensePlate(), vehicle);
    }

    //findVehicleByLicensePlate: Si no existe, lanzar excepción personalizada
    public Vehicle findVehicleByLicensePlate(String licensePlate) throws VehicleNotFoundException {
        Vehicle vehicle = vehiclesByLicensePlate.get(licensePlate);
        if (vehicle == null) {
            throw new VehicleNotFoundException(licensePlate);
        }
        return vehicle;
    }

    //getAllLicensePlates: si no hay ninguno lanzar excepción personalizada
    public Set<String> getAllLicensePlates() throws EmptyLicensePlateException{
        if (vehiclesByLicensePlate.isEmpty()) {
            throw new EmptyLicensePlateException();
        }
        return vehiclesByLicensePlate.keySet();
    }

    //filterByType: si no existe el tipo, lanzar excepción personalizada
    public List<Vehicle> filterByType(Class<?> type) throws TypeNotFoundException{
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle: vehicles){
            if(type.isInstance(vehicle)){
                result.add(vehicle);
            }
        }
        if (result.isEmpty()) {
            throw new TypeNotFoundException(type.getSimpleName());
        }
        return result;
    }

    //deleteByLicensePlate: si no existe la matricula lanzar excepcion personalizada
    public void deleteByLicensePlate(String licensePlate) throws VehicleNotFoundException{
        if (!vehiclesByLicensePlate.containsKey(licensePlate)) {
            throw new VehicleNotFoundException(licensePlate);
        }
        vehicles.remove(vehiclesByLicensePlate.get(licensePlate));
        vehiclesByLicensePlate.remove(licensePlate);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
