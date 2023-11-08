public abstract class AFuelCar extends ACar  {
    private final int kmPrLitre;

    public AFuelCar(String make, String model, int numberOfDoors, String registrationNumber,int kmPrLitre) {
        super(make, model, numberOfDoors, registrationNumber);
        this.kmPrLitre = kmPrLitre;
    }

//region getters
    public abstract String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;
    }
//endregion


    @Override
    public String toString() {
        return String.format("%sKm/L: %d\n",
                super.toString(),
                kmPrLitre
        );
    }
}
