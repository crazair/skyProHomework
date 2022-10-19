package sky.pro.homework.javacore.hw24;

public class DriverD<T extends Bus> extends Driver{

    private T bus;

    public DriverD(String fullName, boolean isDriversLicense, double experience) {
        super(fullName, isDriversLicense, experience);
    }

    public void setTransport(T transport) {
        bus = transport;
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель D управляет автобусом " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде");
    }
}