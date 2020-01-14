class Fiat extends Vehicle {

    Fiat(){
        super(4, 5, "grey", "SM67 VKS", 40000.00, "Punto");
    }

    @Override
    public String whichVehicle(){
        return "Chug, Splatter, Fart, I am the Fiat Punto";
    }
}
