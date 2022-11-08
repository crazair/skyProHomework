package sky.pro.homework.javacore.course_work_2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DayBook {

    private Map<Integer, Task> activeTasks = new LinkedHashMap<>();
    private Map<Integer, Task> archiveTasks = new LinkedHashMap<>();


    public void addActiveTask(@NotNull Task task) {
        task.setDeleted(false);
        activeTasks.putIfAbsent(task.getId(), task);
    }

    public void addArchiveTask(@NotNull Task task) {
        task.setDeleted(true);
        archiveTasks.putIfAbsent(task.getId(), task);
    }

    public void deleteTask(int id) {
        Task task = getTaskById(id);
        if (task == null) {
            System.out.println("Задача с номером " + id + " не найдена.");
            return;
        }
        System.out.println("Удаляем task: " + task);
        activeTasks.remove(task.getId());
        addArchiveTask(task);
    }

    public Task getTaskById(int id) {
        return activeTasks.get(id);
    }

    public void printAll() {
        activeTasks.forEach((integer, task) -> System.out.println(task));
    }

    public void litePrintAll() {
        activeTasks.forEach((integer, task) -> System.out.println(task.getLiteInformation()));
    }

    public void printDeletedTasks() {
        archiveTasks.forEach((integer, task) -> System.out.println(task));
    }

    public List<Task> getTasksByDay(LocalDate day) {
        List<Task> taskList = new ArrayList<>();
        for (Map.Entry<Integer, Task> entry : activeTasks.entrySet()) {
            if (entry.getValue().isTaskDay(day)) {
                taskList.add(entry.getValue());
            }
        }
        return taskList;
    }

    public void printTasksForDays(int countDays) {
        for (int i = 0; i < countDays; i++) {
            LocalDate day = LocalDate.now().plusDays(i);
            System.out.println("############## Задачи на день: " + day);
            List<Task> tasks = getTasksByDay(day);
            if (tasks.size() == 0) {
                System.out.println("Задачи отсутствуют!");
            } else {
                tasks.forEach(System.out::println);
            }
        }
    }

}
