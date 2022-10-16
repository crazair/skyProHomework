package sky.pro.homework.javacore.hw22;

public class Main {

    public static void main(String[] args) {

        Human vladimir = new Human(21, "Владимир", "Казань", null);

        vladimir.hello();

        System.out.println("\n#################\n");

        Flower flower1 = new Flower("Роза обыкновенная", "Красная", "Голландия", 35.59, 0);
        Flower flower2 = new Flower("Хризантема", null, null, 15, 5);
        Flower flower3 = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower flower4 = new Flower("Гипсофила", null, "Турция", 19.5, 00);

        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);

    }
}
