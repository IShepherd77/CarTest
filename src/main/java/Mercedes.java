class Mercedes extends Vehicle {

    Mercedes(){
        super(4, 2, "red", "2 ABC", 35000.00, "Mercedes");
    }

    @Override
    public String whichVehicle(){
        return "Vroom, vroom, I am the Mercedes";
    }
}
