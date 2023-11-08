import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();
    public FleetOfCars(){


    }

    public void addCar(Car car){
    fleet.add(car);

    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegFee = 0;
        for (Car car:fleet) {
            totalRegFee += car.getRegistrationFee();
        }
        return totalRegFee;
    }

    @Override
    public String toString(){
        String wholeFleet = "";
        for (Car car:fleet) {
            wholeFleet +=car.toString() + "\n";
        }
        return wholeFleet;
    }
}
