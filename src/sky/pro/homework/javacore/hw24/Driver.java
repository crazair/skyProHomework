package sky.pro.homework.javacore.hw24;

public abstract class Driver {

    private String fullName;
    private boolean isDriversLicense;
    private double experience;

    public Driver(String fullName, boolean isDriversLicense, double experience) {
        this.fullName = fullName;
        this.isDriversLicense = isDriversLicense;
        this.experience = experience;
    }

    public abstract void startMoving();

    public void stop(){
        System.out.println("Стоп!");
    }

    public void refuel(){
        System.out.println("Заправляемся");
    }

}
