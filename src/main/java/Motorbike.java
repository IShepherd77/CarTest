public class Motorbike extends Vehicle {

    Motorbike(){
        super(2, 0, "black", "MOTBK1", 4999.99, "Honda");
    }

    @Override
    public String whichVehicle(){
        return "Broooooom, brmmmm, I am the motor bike";
    }
}
