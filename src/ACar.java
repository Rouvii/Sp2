public abstract class ACar implements Car {

private String registrationNumber;
 private final String make;
 private final String model;
 private final int numberOfDoors;

    public ACar(String make,String model,int numberOfDoors,String registrationNumber){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.registrationNumber = registrationNumber;

    }
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


    @Override
   public String toString(){
        return null;
    }
}
