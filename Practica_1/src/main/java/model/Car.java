package model;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String marca, String modelo, int año, FuelType tipoCombustible, int numbrerOfDoors) {
        super(marca, modelo, año, tipoCombustible);
        this.numberOfDoors = numbrerOfDoors;
    }

    @Override
    public void displayInformation() {
        System.out.println("-------------------------------");
        System.out.println("Car Information: ");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("-------------------------------");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
