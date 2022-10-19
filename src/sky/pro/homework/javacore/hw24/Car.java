package sky.pro.homework.javacore.hw24;

public class Car extends Transport implements Competing{

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }

    @Override
    public void pitStop() {
        System.out.println("Зашли на пит-стоп!");
    }

    @Override
    public double getBestTime() {
        System.out.println("Возвращаем лучшее время круга!");
        return 7;
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Возвращаем максимальную скорость!");
        return 250;
    }
}
