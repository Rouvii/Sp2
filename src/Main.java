public class Main {
    public static void main(String[] args) {

    FleetOfCars fleet = new FleetOfCars();

    Car gasCar1 = new GasolinCar("Mazda","Mx5",4,"AK47",11);
    Car diesCar1 = new DieselCar("Mercedes","c220d",5,"M4A4",22,true);
    Car elCar1 = new ElectricCar("Tesla","Roadster",4,"P90",200,1000);

    fleet.addCar(gasCar1);
    fleet.addCar(diesCar1);
    fleet.addCar(elCar1);

    System.out.println(fleet);
    System.out.printf("------------------------------\n" +
            "Total registration fee: %d", fleet.getTotalRegistrationFeeForFleet());
    }
}