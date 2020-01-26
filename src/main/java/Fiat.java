class Fiat extends Vehicle {

    Fiat(){
        super(4, 2, "grey", "GK04 WPD", 40.99, "Punto");
    }

    @Override
    public String whichVehicle(){
        return "Chug, Splatter, Fart, I am the Fiat Punto";
    }

}
