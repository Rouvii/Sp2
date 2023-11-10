import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();
    public FleetOfCars(){


    }

    public void addCar(Car car){
    fleet.add(car);

    }
//Made a for loop to combine all the regestration fees for all of the cars
    public int getTotalRegistrationFeeForFleet(){
        int totalRegFee = 0;
        for (Car car:fleet) {
            totalRegFee += car.getRegistrationFee();
        }
        return totalRegFee;
    }
//toString method to print out the cars from the array
    @Override
    public String toString(){
        String wholeFleet = "";
        for (Car car:fleet) {
            wholeFleet +=car.toString() + "\n";
        }
        return wholeFleet;
    }
}
