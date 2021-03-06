public class Vehicle {

    protected int numberOfWheels;
    protected int numberOfDoors;
    protected String colour;
    protected String registrationNumber;
    protected double valueOfVehicle;
    protected String makeOfVehicle;


    Vehicle(int numOfWheels, int numOfDoors, String colour, String regNo, double value, String make){
        this.numberOfWheels = numOfWheels;
        this.numberOfDoors = numOfDoors;
        this.colour = colour;
        this.registrationNumber = regNo;
        this.valueOfVehicle = value;
        this.makeOfVehicle = make;
    }

    public String whichVehicle(){
        return "Vroom, vroom, I am the vehicle";
    }

    public String costOfVehicle(){
        return "your vehicle costs " + valueOfVehicle;
    }

    public static void main(String[] args) {
//        Vehicle car = new Vehicle(4, 5, "grey", "SM67 VKS", 40000.00, "BMW");

//        System.out.println(car.whichVehicle());
        Vehicle bmw, mercedes, fiat, motorbike;

        bmw = new BMW();
        mercedes = new Mercedes();
        fiat = new Fiat();
        motorbike = new Motorbike();

        Vehicle[] allTheVehicles = {bmw, mercedes, fiat, motorbike};

        for (Vehicle vehicle : allTheVehicles){
            System.out.println(vehicle.whichVehicle());
            System.out.println(vehicle.costOfVehicle());

        }
    }
}
