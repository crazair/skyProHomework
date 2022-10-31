package sky.pro.homework.javacore.course_work_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Task implements Repeatable {

    public enum TaskType {
        PERSONAL_TASK("личная"), WORK_TASK("рабочая");

        private final String name;

        TaskType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum TaskFrequency {
        SINGLE("однократная"), DAILY("ежедневная"), WEEKLY("еженедельная"),
        MONTHLY("ежемесячная"), YEARLY("ежегодная");

        private final String name;

        TaskFrequency(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private static int counter = 0;
    private final int id;
    private String title;
    private String description;
    private final LocalDateTime createDateTime;
    private LocalDateTime finishDateTime;
    private TaskType type;
    private TaskFrequency frequency;
    private boolean isDeleted;

    public Task(String title, String description, LocalDateTime finishDateTime, TaskType type, TaskFrequency frequency) {
        id = ++counter;
        createDateTime = LocalDateTime.now();

        setTitle(title);
        setDescription(description);
        setFinishDateTime(finishDateTime);
        setType(type);
        setFrequency(frequency);
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Поле title не может быть пустым. Сейчас title=" + title);
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Поле description не может быть пустым. Сейчас description=" + description);
        }
        this.description = description;
    }

    public void setFinishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime == null ? LocalDateTime.now() : finishDateTime;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void setFrequency(TaskFrequency frequency) {
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public LocalDateTime getNextDateTime() {
        switch (frequency) {
            case DAILY:
                LocalDateTime nowPlusDay = LocalDateTime.now().plusDays(1);
                return nowPlusDay.isAfter(finishDateTime) ? null : nowPlusDay;
            case WEEKLY:
                LocalDateTime nowPlusWeek = LocalDateTime.now().plusWeeks(1);
                return nowPlusWeek.isAfter(finishDateTime) ? null : nowPlusWeek;
            case MONTHLY:
                LocalDateTime nowPlusMonth = LocalDateTime.now().plusMonths(1);
                return nowPlusMonth.isAfter(finishDateTime) ? null : nowPlusMonth;
            case YEARLY:
                LocalDateTime nowPlusYear = LocalDateTime.now().plusYears(1);
                return nowPlusYear.isAfter(finishDateTime) ? null : nowPlusYear;
            default:
                return null;
        }
    }

    @Override
    public boolean isTaskDay(LocalDate day) {
        switch (frequency) {
            case SINGLE:
                return day.equals(createDateTime.toLocalDate());
            case DAILY:
                return day.atTime(LocalTime.MAX).isAfter(createDateTime) && day.atTime(LocalTime.MIN).isBefore(finishDateTime);
            case WEEKLY:
                return day.atTime(LocalTime.MAX).isAfter(createDateTime) && day.atTime(LocalTime.MIN).isBefore(finishDateTime)
                        && day.getDayOfWeek().equals(createDateTime.getDayOfWeek());
            case MONTHLY:
                return day.atTime(LocalTime.MAX).isAfter(createDateTime) && day.atTime(LocalTime.MIN).isBefore(finishDateTime)
                        && day.getDayOfMonth() == createDateTime.getDayOfMonth();
            case YEARLY:
                return day.atTime(LocalTime.MAX).isAfter(createDateTime) && day.atTime(LocalTime.MIN).isBefore(finishDateTime)
                        && day.getDayOfYear() == createDateTime.getDayOfYear();
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "Задача{" +
                "номер=" + id +
                ", заголовок='" + title + '\'' +
                ", описание='" + description + '\'' +
                ", дата и время создания=" + createDateTime +
                ", дата и время завершения=" + finishDateTime +
                ", тип=" + type.getName() +
                ", частота=" + frequency.getName() +
                ", архивная=" + isDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, createDateTime, finishDateTime, type, frequency, isDeleted);
    }
}
