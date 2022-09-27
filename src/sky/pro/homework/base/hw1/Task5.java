package sky.pro.homework.base.hw1;

public class Task5 {

    public static void main(String[] args) {

// Задача 5
// Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен
// сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
// Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
// Каждый год повышение составляет 10% от текущей зарплаты.
// К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для
// следующих сотрудников:
// Маша получает 67 760 рублей в месяц
// Денис получает 83 690 рублей в месяц
// Кристина получает 76 230 рублей в месяц
// Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу
// между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из
// сотрудников, а также разницу между годовым доходом до и после повышения.
// Выведите в консоль информацию по каждому сотруднику.
// Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”

        int currentSalaryMasha = 67_760;
        int currentSalaryDenis = 83_690;
        int currentSalaryKristina = 76_230;

        float increaseAmount = 1.1f;

        float newSalaryMasha = currentSalaryMasha * increaseAmount;
        float newSalaryDenis = currentSalaryDenis * increaseAmount;
        float newSalaryKristina = currentSalaryKristina * increaseAmount;

        float currentSalaryMashaYr = (newSalaryMasha * 12) - (currentSalaryMasha * 12);
        float currentSalaryDenisYr = (newSalaryDenis * 12) - (currentSalaryDenis * 12);
        float currentSalaryKristinaYr = (newSalaryKristina * 12) - (currentSalaryKristina * 12);

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " +
                "Годовой доход вырос на " + currentSalaryMashaYr + " рублей");
        System.out.println("Маша теперь получает " + newSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + currentSalaryDenisYr + " рублей");
        System.out.println("Маша теперь получает " + newSalaryKristina + " рублей. " +
                "Годовой доход вырос на " + currentSalaryKristinaYr + " рублей");
    }

}
