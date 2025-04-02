package com.practica1.exceptions;

import com.practica1.model.Vehicle;

public class VehicleNotFoundException extends Exception{
    public VehicleNotFoundException(String licensePlate){
        super("Vehículo con matrícula " + licensePlate + " no encontrado.");
    }
}
