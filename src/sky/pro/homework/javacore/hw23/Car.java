package sky.pro.homework.javacore.hw23;

public class Car extends Transport {

    final private double engineVolume;

    public Car(String brand, String model, double engineVolume, String bodyColor, int productionYear, String country, int maxSpeed) {
        super(brand, model, productionYear, country, bodyColor, maxSpeed);
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
    }

    @Override
    public void refill() {
        System.out.println("Заправляю бензином или дизелем на заправке! Или заряжаю на специальных электроду-парковках, если это электрокар!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", bodyColor='" + super.getBodyColor() + '\'' +
                ", productionYear=" + super.getYear() +
                ", country='" + super.getCountry() + '\'' +
                ", maxSpeed='" + super.getMaxSpeed() + '\'' +
                '}';
    }

}
