package sky.pro.homework.javacore.hw24;

public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus("Bus", "Super Bus", 5.0);
        Car car = new Car("Car", "Super Car", 2.0);
        Truck truck = new Truck("Truck", "Super Truck", 7.0);

        DriverB<Car> driverB = new DriverB<>("ИИИ", true, 10);
        driverB.setTransport(car);
        driverB.startMoving();

        DriverC<Truck> driverC = new DriverC<>("ППП", true, 20);
        driverC.setTransport(truck);
        driverC.startMoving();

        DriverD<Bus> driverD = new DriverD<>("CCC", true, 20);
        driverD.setTransport(bus);
        driverD.startMoving();

    }
}
