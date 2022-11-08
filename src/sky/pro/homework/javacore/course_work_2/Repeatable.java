package sky.pro.homework.javacore.course_work_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Repeatable {

    LocalDateTime getNextDateTime();

    boolean isTaskDay(LocalDate day);

}
