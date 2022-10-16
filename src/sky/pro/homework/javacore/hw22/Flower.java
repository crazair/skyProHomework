package sky.pro.homework.javacore.hw22;

public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;


    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name == null ? "Имя не задано" : name;
        this.flowerColor = flowerColor == null ? "Белый" : flowerColor;
        this.country = country == null ? "Россия" : country;
        this.cost = cost <= 0d ? 1d : cost;
        this.lifeSpan = lifeSpan <= 0 ? 3 : lifeSpan;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "Имя не задано" : name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor == null ? "Белый" : flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? "Россия" : country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost <= 0d ? 1d : cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan <= 0 ? 3 : lifeSpan;
    }
}
