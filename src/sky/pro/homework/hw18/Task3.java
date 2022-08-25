package sky.pro.homework.hw18;

public class Task3 {

    public static void main(String[] args) {

// ### Задание 3
// Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
// Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.

        int deliveryDistance = 21;
        int countDays = getDeliveryDays(deliveryDistance);

        System.out.println("Потребуется дней: " + countDays);
    }

    private static int getDeliveryDays(final int deliveryDistance) {
        return deliveryDistance <= 20 ? 1 : 2 + (deliveryDistance - 21) / 40;
    }
}
