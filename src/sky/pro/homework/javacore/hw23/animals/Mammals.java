package sky.pro.homework.javacore.hw23.animals;

public abstract class Mammals extends Animals {

    private String environment;
    private int speed;

    public Mammals(String name, int years, String environment, int speed) {
        super(name, years);
        this.environment = environment == null || environment.isBlank() ? "default" : environment;
        this.speed = speed <= 0 ? 50 : speed;
    }

    public abstract void walk();

}
