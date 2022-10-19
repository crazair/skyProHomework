package sky.pro.homework.javacore.hw23.animals;

public class Flightless extends Birds {

    private String movementType;

    public Flightless(String name, int years, String environment, String movementType) {
        super(name, years, environment);
        this.movementType = movementType == null || movementType.isBlank() ? "default" : movementType;
    }

    public void walk() {
        System.out.println("Гуляю!");
    }

    @Override
    public void eat() {
        System.out.println("Кушаю!");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю!");
    }

}
