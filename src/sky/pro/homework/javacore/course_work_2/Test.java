package sky.pro.homework.javacore.course_work_2;

public class Test {

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }

    public static void test() throws Exception{
        throw new Exception("Произошла ошибка");
    }
}
