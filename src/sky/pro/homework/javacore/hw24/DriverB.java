package sky.pro.homework.javacore.hw24;

public class DriverB<T extends Car> extends Driver{

    private T car;

    public DriverB(String fullName, boolean isDriversLicense, double experience) {
        super(fullName, isDriversLicense, experience);
    }

    public void setTransport(T transport) {
        car = transport;
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель B управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }
}
