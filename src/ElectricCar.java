public class ElectricCar extends ACar {

    private final int batteryCapacity;
    private final int maxRange;


    public ElectricCar(String make, String model, int numberOfDoors, String registrationNumber,int batteryCapacity, int maxRange) {
        super(make, model, numberOfDoors, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
//region getters
    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    public int getWhPrKm(){
        return (batteryCapacity*1000)/maxRange;
    }

    public int getRegistrationFee() {
        double kmPrLitre = 100 / (getWhPrKm() / 91.25);

        if (kmPrLitre <= 50 && kmPrLitre >= 20) {
            return 330;
        } else if (kmPrLitre <= 20 && kmPrLitre >= 15) {
            return 1050;
        } else if (kmPrLitre <= 15 && kmPrLitre >= 10) {
            return 2340;
        } else if (kmPrLitre <= 10 && kmPrLitre >= 5) {
            return 5500;
        } else {
            return 10470;
        }
    }
//endregion
    @Override
    public String toString() {
        return String.format("%sBattery Capacity: %d\nMax range: %d\n",
                super.toString(),
                batteryCapacity,
                maxRange);
    }
}
