package sky.pro.homework.base.hw13;

public class Task4 {

    public static void main(String[] args) {

// Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку банковских карт
// на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать
// расстояние от нашего офиса до адреса доставки.
// Правила доставки такие:
// Доставка в пределах 20 км занимает сутки.
// Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
// Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
// То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
// Напишите программу, которая выдает сообщение в консоль:
// "Потребуется дней: " + срок доставки
// Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.

        int deliveryDistance = 21;
        int countDays =  0;

        if (deliveryDistance <= 20){
            countDays = 1;
        } else {
            countDays = 2 + (deliveryDistance - 21) / 40;
        }

        System.out.println("Потребуется дней: " + countDays);

    }


}
