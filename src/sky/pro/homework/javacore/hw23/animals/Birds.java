package sky.pro.homework.javacore.hw23.animals;

public abstract class Birds extends Animals {

    private String environment;

    public Birds(String name, int years, String environment) {
        super(name, years);
        this.environment = environment;
    }

    public void hunt() {
        System.out.println("Охочусь!");
    }

}


