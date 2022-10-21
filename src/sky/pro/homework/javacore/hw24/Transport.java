package sky.pro.homework.javacore.hw24;

public abstract class Transport implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMoving();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
