package sky.pro.homework.course_work_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Класс по работе с массивом сотрудников <b>Employee<b>
 *
 * @version 1.0
 * @autor Sergey_Anokhin
 */
public class EmployeeBook {

    /**
     * Массив сотрудников
     */
    private Employee[] employees;
    /**
     * Выбранный отдел с которым работаем, если = 0, то все отделы выбраны
     */
    private Integer selectDepartment = 0;

    /**
     * Конструктор - создание нового объекта EmployeeBook
     *
     * @param employees - массив сотрудников
     */
    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Метод установки выбранного отдела с которым в дальнейшем будем работать
     * Для сброса выбранного отдела передать selectDepartment = 0
     *
     * @param selectDepartment - номер отдела
     */
    public void setSelectDepartment(Integer selectDepartment) {
        this.selectDepartment = selectDepartment;
    }

    /**
     * Метод получения выбранного отдела с которым работает объект EmployeeBook
     *
     * @return возвращает номер отдела или 0, если отдел не выбран
     */
    public Integer getSelectDepartment() {
        return selectDepartment;
    }

    /**
     * Метод private списка сотрудников с учётом выбранного отдела
     * Используется только внутри класса EmployeeBook
     *
     * @return employees - Employee[] с учётом выбранного отдела
     */
    private Employee[] getEmployees() {
        if (selectDepartment == 0) return employees;
        return Stream.of(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee.getDepartment().equals(selectDepartment))
                .toArray(Employee[]::new);
    }

    /**
     * Метод добавления нового сотрудника в массив
     * Если в массиве нет свободного места, создаём новы массив размером +1
     *
     * @param employee - новый сотрудник
     * @return int - возвращаем индекс массива в который вставлен новый сотрудник
     */
    public int addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return i;
            }
        }
        Employee[] newEmployees = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        newEmployees[employees.length] = employee;
        employees = newEmployees;
        return employees.length - 1;
    }

    /**
     * Метод удаления сотрудника из массива по Ф.И.О.
     *
     * @param fullName - Ф.И.О сотрудника
     */
    public void deleteEmployeeByFullName(final String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                return;
            }
        }
    }

    /**
     * Метод удаления сотрудника из массива по номеру
     *
     * @param id - номер сотрудника
     */
    public void deleteEmployeeById(Integer id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId().equals(id)) {
                employees[i] = null;
                return;
            }
        }
    }

    /**
     * Метод изменения данных по сотруднику из массива по Ф.И.О.
     * Изменить можно зарплату и департамент
     *
     * @param fullName      - номер сотрудника
     * @param newSalary     - новая зарплата
     * @param newDepartment - новый департамент
     */
    public void changeEmployeeSalaryAndDepartmentByFullName(final String fullName,
                                                            Integer newSalary,
                                                            Integer newDepartment) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(newSalary);
                employee.setDepartment(newDepartment);
                return;
            }
        }
    }

    /**
     * Метод общей печати в консоль сотрудников по всем департаментам с указанием номера
     */
    public void printEmployeesByAllDepartment() {
        Stream.of(employees)
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getDepartment))
                .map(employee -> new String[]{
                        "Номер департамента: " + employee.getDepartment(),
                        "    Сотрудник: " + employee.getFullName() + " (" + employee.getId() + ")"
                })
                .flatMap(strings -> Arrays.stream(strings))
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * Метод общей печати в консоль всех сотрудников
     */
    public void printEmployees() {
        Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }

    /**
     * Метод общей печати в консоль Ф. И. О. всех сотрудников
     */
    public void printEmployeesName() {
        System.out.println("Список Ф. И. О. всех сотрудников:");
        Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .forEach(employee -> System.out.println(employee.getFullName()));
    }

    /**
     * Метод печати в консоль суммы затрат на зарплаты всех сотрудников
     */
    public void printAllSalary() {
        int allSalary = Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Cумма затрат на зарплаты в месяц равна: " + allSalary);
    }

    /**
     * Метод поиска и печати в консоль сотрудника с минимальной зарплатой
     */
    public void findAndPrintEmployeeWithMinSalary() {
        Employee employee = Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .min(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Сотрудник с минимальной зарплатой: " + employee);
    }

    /**
     * Метод поиска и печати в консоль сотрудника с максимальной зарплатой
     */
    public void findAndPrintEmployeeWithMaxSalary() {
        Employee employee = Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Сотрудник с максимальной зарплатой: " + employee);
    }

    /**
     * Метод поиска и печати в консоль среднего арифметического значения зарплат всех сотрудников
     */
    public void findAndPrintAverageSalary() {
        double averageSalary = Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println("Среднее значение зарплат равна: " + averageSalary);
    }

    /**
     * Метод индексации всех сотрудников на определённый процент
     *
     * @param indexPercent - процент индексации
     */
    public void indexSalary(double indexPercent) {
        System.out.printf("Индексируем зарплату всех сотрудников на %s процент", indexPercent);
        Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .forEach(employee -> employee.setSalary(
                        (int) (employee.getSalary() * indexPercent + employee.getSalary()))
                );
    }

    /**
     * Метод поиска и печати в консоль всех сотрудников с зарплатой меньше числа
     *
     * @param salary - размер зарплаты
     */
    public void findAndPrintEmployeesByLessSalary(Integer salary) {
        System.out.println("Вывожу всех сотрудников с зарплатой меньше числа: " + salary);
        Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .filter(employee -> employee.getSalary() < salary)
                .forEach(System.out::println);
    }

    /**
     * Метод поиска и печати в консоль всех сотрудников с зарплатой больше (или равно) числа
     *
     * @param salary - размер зарплаты
     */
    public void findAndPrintEmployeesByMoreSalary(Integer salary) {
        System.out.println("Вывожу всех сотрудников с зарплатой больше (или равно) числа: " + salary);
        Stream.of(getEmployees())
                .filter(Objects::nonNull)
                .filter(employee -> employee.getSalary() >= salary)
                .forEach(System.out::println);
    }
}
