package sky.pro.homework.javacore.hw23;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String bodyColor, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public abstract void refill();

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor == null || bodyColor.isBlank() ? "default" : bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed <= 0 ? 200 : maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
