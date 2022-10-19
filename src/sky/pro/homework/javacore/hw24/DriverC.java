package sky.pro.homework.javacore.hw24;

public class DriverC<T extends Truck> extends Driver{

    private T truck;

    public DriverC(String fullName, boolean isDriversLicense, double experience) {
        super(fullName, isDriversLicense, experience);
    }

    public void setTransport(T transport) {
        truck = transport;
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель C управляет грузовым автомобилем " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде");
    }
}