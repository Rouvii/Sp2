import java.util.ArrayList;

public class FleetOfCars {
    private final ArrayList<Car> fleet;
    public FleetOfCars(){
        fleet = new ArrayList<>();
    }

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegFee = 0;

        for (Car car : fleet) {
            totalRegFee += car.getRegistrationFee();
        }

        return totalRegFee;
    }

    @Override
    public String toString(){
        StringBuilder wholeFleet = new StringBuilder();

        for (Car car : fleet) {
            wholeFleet.append(String.format("%s\n", car.toString()));
        }

        return wholeFleet.toString();
    }
}
