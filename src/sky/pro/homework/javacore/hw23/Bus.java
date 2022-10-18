package sky.pro.homework.javacore.hw23;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String bodyColor, int maxSpeed) {
        super(brand, model, year, country, bodyColor, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{ Transport= " + super.toString() + "}";
    }

    @Override
    public void refill() {
        System.out.println("Заправляю бензином или дизелем на заправке!");
    }
}
