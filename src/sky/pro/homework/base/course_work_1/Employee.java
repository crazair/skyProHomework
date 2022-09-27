package sky.pro.homework.base.course_work_1;

/**
 * Дата класс Сотрудник
 *
 * @version 1.0
 * @autor Sergey_Anokhin
 */
public class Employee {

    /**
     * Счётчик, используем для генерации id
     */
    private static int counter;
    /**
     * Номер сотрудника
     */
    private final Integer id;
    /**
     * Ф.И.О. сотрудника
     */
    private final String fullName;
    /**
     * Номер департамента (от 1 до 10)
     */
    private Integer department;
    /**
     * Зарплата сотрудника
     */
    private Integer salary;

    public Employee(String fullName, Integer department, Integer salary) {
        id = ++counter;
        this.fullName = fullName;
        setDepartment(department);
        setSalary(salary);
    }

    public void setDepartment(Integer department) {
        if (department < 1 || department > 10) throw new IllegalArgumentException("Отдел должен быть между 1 и 10!");
        this.department = department;
    }

    public void setSalary(Integer salary) {
        if (salary < 0) throw new IllegalArgumentException("Зарплата не может быть ниже 0!");
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nСотрудник: " +
                "\n Номер: " +
                id +
                "\n Ф.И.О.: " +
                fullName +
                "\n Департамент: " +
                department +
                "\n Зарплата: " +
                salary;
    }
}
