package sky.pro.homework.javacore.hw21;

public class Car {

    final private String brand;
    final private String model;
    final private double engineVolume;
    final private String bodyColor;
    final private int productionYear;
    final private String country;

    public Car(String brand, String model, double engineVolume, String bodyColor, int productionYear, String country) {
        this.brand = brand == null ? "default" : brand;
        this.model = model == null ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.bodyColor = bodyColor == null ? "белый" : bodyColor;
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.country = country == null ? "default" : country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", productionYear=" + productionYear +
                ", country='" + country + '\'' +
                '}';
    }

    public void printCharacteristics() {
        System.out.println(this);
    }
}
