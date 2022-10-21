package sky.pro.homework.javacore.hw24;

public class DriverD extends Driver {

    public DriverD(String fullName, boolean isDriversLicense, double experience) {
        super(fullName, isDriversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель D управляет автобусом " + getTransport().getBrand() + " " +
                getTransport().getModel() + " и будет участвовать в заезде");
    }
}