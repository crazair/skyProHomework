package sky.pro.homework.javacore.hw28;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MultiplicationTasks {

    private static Set<Task> taskSet = new HashSet<>();


    public static void main(String[] args) {
        while (taskSet.size() < 15) {
            taskSet.add(new Task((int) (Math.random() * 100), (int) (Math.random() * 100)));
        }

        taskSet.stream().forEach(System.out::println);
    }

    private static class Task {

        private int multiplier1;
        private int multiplier2;
        private int result;

        public Task(int multiplier1, int multiplier2) {
            this.multiplier1 = multiplier1;
            this.multiplier2 = multiplier2;
            result = multiplier1 * multiplier2;
        }

        public int getMultiplier1() {
            return multiplier1;
        }

        public int getMultiplier2() {
            return multiplier2;
        }

        public int getResult() {
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Task task = (Task) o;
            return multiplier1 == task.multiplier1 && multiplier2 == task.multiplier2 ||
                    multiplier1 == task.multiplier2 && multiplier2 == task.multiplier1;
        }

        @Override
        public int hashCode() {
            return Objects.hash(result);
        }

        @Override
        public String toString() {
            return "Task: " + multiplier1 + " * " + multiplier2 + " = " + result;
        }
    }
}
