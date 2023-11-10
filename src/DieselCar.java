public class DieselCar extends AFuelCar {

    private Boolean particleFilter;

    public DieselCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre, boolean particleFilter) {
        super(make, model, numberOfDoors, registrationNumber, kmPrLitre);
        this.particleFilter=particleFilter;
    }


    @Override
    public String getFuelType(){

        return "Diesel";
    }
    public boolean hasParticleFilter(){

        return particleFilter;
        }

//A getter which calculates the registration fee for a diesel type car. I expect that not many cars drive above 50KmPrLitre
    // therefor everything that doesn't drive within the specified numbers in the if-statements will return 10470 + the 15269 ekstra fee for a diesel car.
    //can be fixed with simply everyting that drives above 50 KmPrLitre will return 330+the ekstra fee for a diesel car
    //Made a variable of type int particleFee, which is set to 1000. Which is the fee for having no particle filter
    //included an if-statement if(hasParticleFilter() will set the particleFee to 0 using our has method.
    public int getRegistrationFee(){
            int particleFee = 1000;
            if(hasParticleFilter()){
                particleFee = 0;
            }
        if (getKmPrLitre() <= 50 && getKmPrLitre() >= 20) {
            return 330+130+particleFee;
        } else if (getKmPrLitre() <= 20 && getKmPrLitre() >= 15) {
            return 1050+1390+particleFee;
        } else if (getKmPrLitre() <= 15 && getKmPrLitre() >= 10) {
            return 2340+1850+particleFee;
        } else if (getKmPrLitre() <= 10 && getKmPrLitre() >= 5) {
            return 5500+2770+particleFee;
        } else {
            return 10470+15269+particleFee;
        }

    }

    public String toString(){

        return "Make: " +getMake() +"\n" + "Model: " + getModel() +"\n" +"Regestration number: " + getRegistrationNumber() + "\n" + "Number of doors: " + getNumberOfDoors() + "\n" +"Particlefilter: "+ hasParticleFilter() +"\n" + "Km/L: " + getKmPrLitre() + "\n"+ "Registration fee: " + getRegistrationFee() + "\n";
    }
}
