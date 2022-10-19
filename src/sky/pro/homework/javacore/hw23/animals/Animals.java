package sky.pro.homework.javacore.hw23.animals;

public abstract class Animals {

    private final String name;
    private final int years;

    public Animals(String name, int years) {
        this.name = name == null || name.isBlank() ? "default" : name;
        this.years = years <= 0 ? 2000 : years;
    }

    public abstract void eat();

    public abstract void sleep();

    public void move() {
        System.out.println("Двигаюсь!");
    }

}
