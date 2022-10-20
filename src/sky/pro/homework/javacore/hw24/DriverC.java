package sky.pro.homework.javacore.hw24;

public class DriverC extends Driver {

    public DriverC(String fullName, boolean isDriversLicense, double experience) {
        super(fullName, isDriversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель C управляет грузовым автомобилем " + getTransport().getBrand() + " " +
                getTransport().getModel() + " и будет участвовать в заезде");
    }
}