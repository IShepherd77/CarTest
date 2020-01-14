public class Vehicle {

    protected int numberOfWheels;
    protected int numberOfDoors;
    protected String colour;
    protected String registrationNumber;
    protected double valueOfVehicle;


    Vehicle(int numOfWheels, int numOfDoors, String colour, String regNo, double value){
        this.numberOfWheels = numOfWheels;
        this.numberOfDoors = numOfDoors;
        this.colour = colour;
        this.registrationNumber = regNo;
        this.valueOfVehicle = value;
    }

}
