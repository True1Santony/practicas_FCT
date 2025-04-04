package com.practica1.model;

public class Motorcycle extends Vehicle{

    private int engineDisplacement;  // Cilindrada del motor

    public Motorcycle(String brand, String model, int year, FuelType fuelType,int engineDisplacement) {
        super(brand, model, year, fuelType);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public void displayInformation() {
        System.out.println("-------------------------------");
        System.out.println("Motorcycle Information: ");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Engine Displacement: " + engineDisplacement + " cc");
        System.out.println("-------------------------------");
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }
}
