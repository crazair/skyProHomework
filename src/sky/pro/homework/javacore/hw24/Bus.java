package sky.pro.homework.javacore.hw24;

public class Bus extends Transport{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }

    @Override
    public void passDiagnostics() throws RuntimeException {
        throw new RuntimeException("Автобус в диагностике не требуется!");
    }

    @Override
    public void pitStop() {
        System.out.println("Зашли на пит-стоп!");
    }

    @Override
    public double getBestTime() {
        System.out.println("Возвращаем лучшее время круга!");
        return 15;
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Возвращаем максимальную скорость!");
        return 120;
    }

    @Override
    public boolean isPassDiagnostics() throws RuntimeException{
        throw new RuntimeException("Автобус в диагностике не требуется!");
    }

}
