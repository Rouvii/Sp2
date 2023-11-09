public class DieselCar extends AFuelCar {
    private final Boolean particleFilter;

    public DieselCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre, boolean particleFilter) {
        super(make, model, numberOfDoors, registrationNumber, kmPrLitre);
        this.particleFilter=particleFilter;
    }

//region getters
    @Override
    public String getFuelType(){
        return "Diesel";
    }

    public int getRegistrationFee(){
        int particleFee = 1000;

        if(hasParticleFilter()){
            particleFee = 0;
        }

        if (getKmPrLitre() <= 50 && getKmPrLitre() >= 20) {
            return 330 + 130 + particleFee;
        } else if (getKmPrLitre() <= 20 && getKmPrLitre() >= 15) {
            return 1050 + 1390 + particleFee;
        } else if (getKmPrLitre() <= 15 && getKmPrLitre() >= 10) {
            return 2340 + 1850 + particleFee;
        } else if (getKmPrLitre() <= 10 && getKmPrLitre() >= 5) {
            return 5500 + 2770 + particleFee;
        } else {
            return 10470 + 15269 + particleFee;
        }
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }
//endregion

    public String toString(){
        return String.format("%sParticle-filter: %b\n",
                super.toString(),
                hasParticleFilter()
        );
    }
}
