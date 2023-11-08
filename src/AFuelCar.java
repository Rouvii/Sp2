public abstract class AFuelCar extends ACar  {

    private int kmPrLitre;



    public AFuelCar(String make, String model, int numberOfDoors, String registrationNumber,int kmPrLitre) {
        super(make, model, numberOfDoors, registrationNumber);
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){

        return null;
    }

    public int getKmPrLitre(){

        return kmPrLitre;
    }

    @Override
    public String toString(){

        return null;
    }
}
