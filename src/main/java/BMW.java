class BMW extends Vehicle {

    BMW(){
    super(4, 5, "grey", "SM67 VKS", 40000.00, "BMW");
    }

    @Override
    public String whichVehicle(){
        return "Vroom, vroom, I am the BMW";
    }
}
