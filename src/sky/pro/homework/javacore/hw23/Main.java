package sky.pro.homework.javacore.hw23;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 1.7, "Желтого", 2015, "Россия", 300);

        System.out.println(lada);

        System.out.println("\n#################\n");

        Train train1 = new Train("Поезд Ласточка", "B-901", 2011, "Россия", null,
                301, 3500, 100, "Белорусского вокзала", "Минск-Пассажирский", 11);

        Train train2 = new Train("Поезд Ленинград", "D-125", 2019, "Россия", null,
                270, 1700, 100, "Ленинградского вокзала", "Ленинград-Пассажирский", 8);

        System.out.println(train1);
        System.out.println(train2);

        System.out.println("\n#################\n");

        Bus bus1 = new Bus("Bus1", "Bus 001", 2000, "Россия", "Зелёный", 100);
        Bus bus2 = new Bus("Bus2", "Bus 002", 2010, "Россия", "Жёлтый", 120);
        Bus bus3 = new Bus("Bus3", "Bus 003", 2020, "Россия", "Белый", 130);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        lada.refill();
        train1.refill();
        bus1.refill();


    }
}
