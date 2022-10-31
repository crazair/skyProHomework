package sky.pro.homework.javacore.course_work_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import static sky.pro.homework.javacore.course_work_2.Task.TaskFrequency.*;
import static sky.pro.homework.javacore.course_work_2.Task.TaskType.*;

public class Main {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static DayBook dayBook = new DayBook();

    static {
        System.out.println("Создали тестовых задач:");
        dayBook.addActiveTask(new Task("Test1", "Description1", LocalDateTime.now(), PERSONAL_TASK, SINGLE));
        dayBook.addActiveTask(new Task("Test2", "Description2", LocalDateTime.now().plusDays(1), PERSONAL_TASK, DAILY));
        dayBook.addActiveTask(new Task("Test3", "Description3", LocalDateTime.now().plusDays(30), WORK_TASK, WEEKLY));
        dayBook.addActiveTask(new Task("Test4", "Description4", LocalDateTime.now().plusDays(90), WORK_TASK, MONTHLY));
        dayBook.addActiveTask(new Task("Test5", "Description5", LocalDateTime.now().plusDays(1000), WORK_TASK, YEARLY));

        dayBook.addArchiveTask(new Task("Test11", "Description11", LocalDateTime.now(), PERSONAL_TASK, SINGLE));

        dayBook.printAll();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner);
                            break;
                        case 2:
                            deleteTask(scanner);
                            break;
                        case 3:
                            getTasksByDay(scanner);
                            break;
                        case 4:
                            dayBook.printAll();
                            break;
                        case 5:
                            dayBook.printDeletedTasks();
                            break;
                        case 6:
                            editTaskById(scanner);
                            break;
                        case 7:
                            dayBook.printTasksForDays(30);
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner) {
        try {
            System.out.print("Введите название задачи: ");
            String title = scanner.next();
            System.out.print("Введите описание задачи: ");
            String description = scanner.next();
            System.out.print("Введите тип задачи задачи (1 - личная, 2 - рабочая): ");
            int type = scanner.nextInt();
            if (type != 1 && type != 2) {
                System.out.println("Некорректный ввод типа задачи! " + type + " Начните заново.");
                return;
            }
            System.out.print("Введите повторяемость задачи (1 - однократная, 2 - ежедневная, 3 - еженедельная, 4 - ежемесячная, 5 - ежегодная): ");
            int frequency = scanner.nextInt();
            if (frequency != 1 && frequency != 2 && frequency != 3 && frequency != 4 && frequency != 5) {
                System.out.println("Некорректный ввод повторяемости задачи! " + frequency + " Начните заново.");
                return;
            }
            System.out.print("Введите дату окончания задачи (формат 'yyyy-MM-dd'): ");
            LocalDate finishDate = LocalDate.parse(scanner.next(), FORMATTER);
            LocalDateTime finishDateTime = LocalDateTime.of(finishDate, LocalTime.now());

            System.out.println("Создаём задачу в ежедневнике!");
            Task task = new Task(title, description, finishDateTime,
                    Task.TaskType.values()[type - 1], Task.TaskFrequency.values()[frequency - 1]);
            System.out.println(task);
            dayBook.addActiveTask(task);
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка в работе программы: " + e);
        }
    }

    private static void deleteTask(Scanner scanner) {
        try {
            System.out.print("Введите номер задачи для удаления: ");
            int taskId = scanner.nextInt();
            Task task = dayBook.getTaskById(taskId);
            if (task == null) {
                System.out.println("Задачи с номером " + taskId + " не найдено");
                return;
            }
            dayBook.deleteTask(taskId);
            System.out.println("Задача с номером " + taskId + " успешно удалена");
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка в работе программы: " + e);
        }
    }

    private static void getTasksByDay(Scanner scanner) {
        try {
            System.out.print("Введите дату на которую показать все задачи (формат 'yyyy-MM-dd'): ");
            LocalDate day = LocalDate.parse(scanner.next(), FORMATTER);
            List<Task> tasks = dayBook.getTasksByDay(day);
            if (tasks.size() == 0) {
                System.out.println("На день " + day + " задач нет!");
            } else {
                tasks.forEach(System.out::println);
            }
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка в работе программы: " + e);
        }
    }

    private static void editTaskById(Scanner scanner) {
        try {
            System.out.print("Введите номер задачи для редактирования: ");
            int taskId = scanner.nextInt();
            Task task = dayBook.getTaskById(taskId);
            if (task == null) {
                System.out.println("Задачи с номером " + taskId + " не найдено");
                return;
            }
            System.out.print("Введите название задачи: ");
            String title = scanner.next();
            System.out.print("Введите описание задачи: ");
            String description = scanner.next();
            task.setTitle(title);
            task.setDescription(description);
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка в работе программы: " + e);
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println(" 1 - Добавить задачу " +
                "\n 2 - Удалить задачу " +
                "\n 3 - Получить задачу на указанный день " +
                "\n 4 - Распечатать все активные задачи в ежедневнике " +
                "\n 5 - Распечатать все удалённые задачи в ежедневнике " +
                "\n 6 - Редактировать заголовок и описание выбранной задачи " +
                "\n 7 - Показать задачи по дням (на 30 дней) " +
                "\n 0 - Выход ");
    }

}
