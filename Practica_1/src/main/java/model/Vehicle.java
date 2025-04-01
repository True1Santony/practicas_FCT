package model;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private FuelType fuelType;

    public Vehicle(String marca, String modelo, int año, FuelType tipoCombustible) {
        this.brand = marca;
        this.model = modelo;
        this.year = año;
        this.fuelType = tipoCombustible;
    }


    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public void brake() {
        System.out.println("The vehicle is braking.");
    }

    public abstract void mostrarInformacion();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
