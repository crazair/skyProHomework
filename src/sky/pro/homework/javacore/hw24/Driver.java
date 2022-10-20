package sky.pro.homework.javacore.hw24;

public abstract class Driver<T extends Transport> {

    private String fullName;
    private boolean isDriversLicense;
    private double experience;

    private T transport;

    public Driver(String fullName, boolean isDriversLicense, double experience) {
        this.fullName = fullName;
        this.isDriversLicense = isDriversLicense;
        this.experience = experience;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public T getTransport() {
        return transport;
    }

    public abstract void startMoving();

    public void stop(){
        System.out.println("Стоп!");
    }

    public void refuel(){
        System.out.println("Заправляемся");
    }

    public boolean isDriversLicense() {
        return isDriversLicense;
    }
}
