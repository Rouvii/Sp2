public class Main {



    public static void main(String[] args) {

    FleetOfCars fleet = new FleetOfCars();

    GasolinCar gasCar1 = new GasolinCar("Mazda","Mx5",4,"AK47",11);
    DieselCar diesCar1 = new DieselCar("Mercedes","c220d",5,"M4A4",22,true);
    ElectricCar elCar1 = new ElectricCar("Tesla","Roadster",4,"P90",200,1000);


    fleet.addCar(gasCar1);
    fleet.addCar(diesCar1);
    fleet.addCar(elCar1);


        System.out.println(fleet);
        System.out.println("\n Total registration fee: ");
        System.out.println(fleet.getTotalRegistrationFeeForFleet());


    }




}