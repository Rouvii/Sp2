public abstract class ACar implements Car {
    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;
    public ACar(String make,String model,int numberOfDoors,String registrationNumber){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.registrationNumber = registrationNumber;
    }

    //region getters
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    //endregion

    @Override
    public String toString() {
        return String.format("Make: %s\nModel: %s\nNumber of doors: %d\nRegistration number: %s\nRegistration fee: %d\n",
                make,
                model,
                numberOfDoors,
                registrationNumber,
                getRegistrationFee()
                );
    }
}
