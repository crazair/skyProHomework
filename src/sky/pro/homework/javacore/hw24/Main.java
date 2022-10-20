package sky.pro.homework.javacore.hw24;

public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus("Bus", "Super Bus", 5.0);
        Car car = new Car("Car", "Super Car", 2.0);
        Truck truck = new Truck("Truck", "Super Truck", 7.0);

        Driver<Car> driverB = new DriverB("ИИИ", true, 10);
        driverB.setTransport(car);
        driverB.startMoving();

        Driver<Truck> driverC = new DriverC("ППП", true, 20);
        driverC.setTransport(truck);
        driverC.startMoving();

        Driver<Bus> driverD = new DriverD("CCC", true, 20);
        driverD.setTransport(bus);
        driverD.startMoving();

        try {
            car.passDiagnostics();
            if (!car.isPassDiagnostics()){
                throw new RuntimeException("Автомобиль не прошёл диагностику!!!");
            }
            truck.passDiagnostics();
            if (!truck.isPassDiagnostics()){
                throw new RuntimeException("Грузовик не прошёл диагностику!!!");
            }
            bus.isPassDiagnostics();
        }catch (RuntimeException e){
            System.out.println("Ошибка: " + e);
        }


    }
}
