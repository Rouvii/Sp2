public class GasolinCar extends AFuelCar {


    public GasolinCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre) {
        super(make, model, numberOfDoors, registrationNumber, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }

    public int getRegistrationFee() {
        if (getKmPrLitre() <= 50 && getKmPrLitre() >= 20) {
            return 330;
        } else if (getKmPrLitre() <= 20 && getKmPrLitre() >= 15) {
            return 1050;
        } else if (getKmPrLitre() <= 15 && getKmPrLitre() >= 10) {
            return 2340;
        } else if (getKmPrLitre() <= 10 && getKmPrLitre() >= 5) {
            return 5500;
        } else {
            return 10470;
        }
    }




    @Override
    public String toString(){

        return "Make: " +getMake() +"\n" + "Model: " + getModel() +"\n" +"Regestration number: " + getRegistrationNumber() + "\n" + "Number of doors: " + getNumberOfDoors() + "\n" + "Km/L: " + getKmPrLitre() + "\n" + "Registration fee: " + getRegistrationFee() + "\n";
    }
}
