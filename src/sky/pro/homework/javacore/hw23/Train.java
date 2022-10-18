package sky.pro.homework.javacore.hw23;

public class Train extends Transport {

    private double tripPrice;
    private int travelTime;
    private String departureStationName;
    private String endingStation;
    private int wagons;

    public Train(String brand, String model, int year, String country, String bodyColor, int maxSpeed, double tripPrice, int travelTime, String departureStationName, String endingStation, int wagons) {
        super(brand, model, year, country, bodyColor, maxSpeed);
        this.tripPrice = tripPrice <= 0d ? 120d : tripPrice;
        this.travelTime = travelTime <= 0 ? 120 : travelTime;
        this.departureStationName = departureStationName == null || departureStationName.isBlank() ? "default" : departureStationName;
        this.endingStation = endingStation == null || endingStation.isBlank() ? "default" : endingStation;
        this.wagons = wagons <= 0 ? 20 : wagons;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "tripPrice=" + tripPrice +
                ", travelTime=" + travelTime +
                ", departureStationName='" + departureStationName + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", wagons=" + wagons +
                "  Transport= " + super.toString() +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Заправляю дизелем!");
    }
}
