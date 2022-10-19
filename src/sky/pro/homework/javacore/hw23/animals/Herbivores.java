package sky.pro.homework.javacore.hw23.animals;

public class Herbivores extends Mammals {

    private String typeFood;

    public Herbivores(String name, int years, String environment, int speed, String typeFood) {
        super(name, years, environment, speed);
        this.typeFood = typeFood == null || typeFood.isBlank() ? "default" : typeFood;
    }

    public void graze(){
        System.out.println("Пасусь!");
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
    public void walk() {
        System.out.println("Гуляю!");
    }
}
