package sky.pro.homework.course_work_1;

public class App {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иваныч", 1, 50000);
        employees[1] = new Employee("Иванов Иван Петрович", 1, 150000);
        employees[2] = new Employee("Иванов Иван Сидорович", 3, 250000);
        employees[3] = new Employee("Иванов Иван Саныч", 4, 350000);
        employees[4] = new Employee("Иванов Иван Сергеичь", 1, 25000);
        employees[5] = new Employee("Иванов Иван Сергеичь2", 1, 15000);

        EmployeeBook employeeBook = new EmployeeBook(employees);

//  Базовая сложность
        employeeBook.printEmployees();
        employeeBook.printAllSalary();
        employeeBook.findAndPrintEmployeeWithMinSalary();
        employeeBook.findAndPrintEmployeeWithMaxSalary();
        employeeBook.findAndPrintAverageSalary();
        employeeBook.printEmployeesName();

// Повышенная сложность
        employeeBook.setSelectDepartment(1);
        employeeBook.indexSalary(0.10);
        employeeBook.findAndPrintEmployeeWithMinSalary();
        employeeBook.findAndPrintEmployeeWithMaxSalary();
        employeeBook.printAllSalary();
        employeeBook.findAndPrintAverageSalary();
        employeeBook.findAndPrintAverageSalary();
        employeeBook.indexSalary(0.01);
        employeeBook.printEmployees();
        employeeBook.setSelectDepartment(0);

// Очень сложно
        employeeBook.findAndPrintEmployeesByLessSalary(50000);
        employeeBook.findAndPrintEmployeesByMoreSalary(50000);

        employeeBook.addEmployee(new Employee("Иванов Иван Сергеичь3", 6, 9000));
        employeeBook.printEmployees();
        employeeBook.deleteEmployeeByFullName("Иванов Иван Сергеичь3");
        employeeBook.printEmployees();
        employeeBook.addEmployee(new Employee("Иванов Иван Сергеичь3", 6, 9000));
        employeeBook.changeEmployeeSalaryAndDepartmentByFullName("Иванов Иван Сергеичь3", 10000, 7);
        employeeBook.printEmployees();

        employeeBook.printEmployeesByAllDepartment();
    }


}
