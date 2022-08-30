package sky.pro.homework.hw19_110;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        hw110();
    }

    private static void hw19() {

        // ## Минимальный уровень
        //
        // 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей
        // должны быть String, Author (который мы создадим  в п. 2) и int.
        // 2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        // 3. Написать конструкторы для обоих классов, заполняющие все поля.
        // 4. Создать геттеры для всех полей автора и всех полей книги.
        // 5. Создать сеттер для поля «Год публикации» у книги.
        // 6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже
        // двух) и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут
        // создаться без авторов.
        //
        // Метод main не должен находиться в классах Book и Author.
        // Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        //
        // 7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

        // ## Средний уровень
        //
        // 1. Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
        // 2. Написать статические методы для работы с массивом в классе, где располагается метод main:
        // 1. Добавить книгу (найти свободную ячейку массива и положить туда книгу). Учесть, что этот метод может быть вызван
        // любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
        // 2. Напечатать в консоль все книги из массива в следующем формате:
        //
        // “Stephen King: The Stand: 1978”

        // ## Сложный уровень
        //
        // 1. Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
        //
        // Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют. Работать
        // с массивом можно только через внутренние нестатические методы класса Library.
        //
        // 2. Конструктор класса должен получать в качестве параметра размер массива и инициализировать в себе поле
        // массива тем размером, что пришел параметром.
        // 3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
        // 4. Создать новые нестатические методы в классе Library:
        // 1. Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
        //
        //  Формат: “The Stand by Stephen King was published in 1978”
        //
        // 2. Изменить год публикации книги по ее названию.
        //
        // В метод подаются два параметра, а именно: название и новый год публикации. Нужно найти книгу и изменить ее год
        // публикации.

        System.out.println("\n ## Минимальный уровень");
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Petr", "Petrov");

        Book book1 = new Book("The Stand", author1, 1978);
        Book book2 = new Book("Harry Potter", author2, 1990);

        System.out.println(book1);
        System.out.println(book2);

        book1.setYearPublication(LocalDate.now().getYear());
        System.out.println(book1);


        System.out.println("\n ## Средний уровень");
        Book[] books = new Book[]{book1, book2};
        Book[] newBooks = addBook(books, new Book("new book", author1, 1900));

        printBooks(newBooks);


        System.out.println("\n ## Сложный уровень");
        Library library = new Library(newBooks);
        library.printBooks();
        library.printBookByName("The Stand");
        library.changeYearPublicationByName("The Stand", 2023);
        library.printBookByName("The Stand");
    }

    private static void hw110() {
        //        ### 1.10 **Простой уровень**
        //
        //        Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на
        //        прошлом уроке. Обратите внимание, что toString книги не должен дублировать код из toString автора,
        //        а должен делегировать (вызывать) его версию метода.


        //        ### **Сложный уровень**
        //
        //        Реализуйте метод toString в классе Library, который выводит все книги библиотеки в формате:
        //              Library:
        //                      книга1
        //                      книга2
        //
        //        Использовать геттеры при написании этого метода запрещено. Нужно корректно делегировать формирование
        //        строки методу toString из книги.
        //          Пример вызова метода и формата вывода смотрите в разделе «Отладка».

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);
    }

    private static Book[] addBook(Book[] books, Book book) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        return newBooks;
    }

    private static void printBooks(Book[] books) {
        Arrays.stream(books).forEach(System.out::println);
    }
}
