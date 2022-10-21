package sky.pro.homework.javacore.hw24;

public class DriverB extends Driver{

    public DriverB(String fullName, boolean isDriversLicense, double experience) {
        super(fullName, isDriversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель B управляет автомобилем " + getTransport().getBrand() + " " +
                getTransport().getModel() + " и будет участвовать в заезде");
    }
}
