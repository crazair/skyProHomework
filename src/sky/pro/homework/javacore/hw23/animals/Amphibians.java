package sky.pro.homework.javacore.hw23.animals;

public class Amphibians extends Animals{

    private String environment;

    public Amphibians(String name, int years, String environment) {
        super(name, years);
        this.environment = environment == null || environment.isBlank() ? "default" : environment;
    }

    public void hunt(){
        System.out.println("Охочусь!");
    }

    @Override
    public void eat() {
        System.out.println("Кушаю!");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю!");
    }

    @Override
    public void move() {
        System.out.println("Двигаюсь!");
    }

}
