package sky.pro.homework.javacore.hw21;

public class Main {

    public static void main(String[] args) {

        Human maksim = new Human(35, "Максим", "Минск", "Бренд-менеджер");
        Human anna = new Human(29, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "Директор по развитию бизнеса");
        Human vasia = new Human(-27, null, null, null);

        maksim.hello();
        anna.hello();
        katya.hello();
        artem.hello();
        vasia.hello();

        System.out.println("\n#################\n");

        Car lada = new Car("Lada", "Grande", 1.7, "Желтого", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car BMW = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car kia = new Car("BMW", "Sportage 4", 2.4, "Красная", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        Car hyundai2 = new Car(null, null, 0, "Оранжевый", 2016, "Южная Корея");

        lada.printCharacteristics();
        audi.printCharacteristics();
        BMW.printCharacteristics();
        kia.printCharacteristics();
        hyundai.printCharacteristics();
        hyundai2.printCharacteristics();

    }
}
