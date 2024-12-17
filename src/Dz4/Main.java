package Dz4; import java.util.Arrays; import java.util.List;
public class Main {public static void main(String[] args) {
        Student student1 = new Student("Иван", Arrays.asList(
                new Book("Книга 1", 100, 1999),
                new Book("Книга 2", 150, 2010),
                new Book("Книга 3", 120, 2020),
                new Book("Книга 4", 130, 1980),
                new Book("Книга 5", 140, 1970)));
        Student student2 = new Student("Петр", Arrays.asList(
                new Book("Книга 6", 110, 2005),
                new Book("Книга 7", 160, 2000),
                new Book("Книга 8", 125, 2015),
                new Book("Книга 9", 135, 1960),
                new Book("Книга 10", 145, 1950)));
        Student student3 = new Student("Сергей", Arrays.asList(
                new Book("Книга 11", 115, 2010),
                new Book("Книга 12", 165, 2010),
                new Book("Книга 13", 128, 2018),
                new Book("Книга 14", 138, 1940),
                new Book("Книга 15", 148, 1930)));
        List<Student> students = Arrays.asList(student1, student2, student3);
        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted((b1, b2) -> Integer.compare(b1.getPagesCount(), b2.getPagesCount()))
                .distinct()
                .filter(book -> book.getYearOfPublication() > 2000)
                .limit(3)
                .map(Book::getYearOfPublication)
                .findAny()
                .ifPresentOrElse(year -> System.out.println("Год выпуска первой книги: " + year),
                                      () -> System.out.println("Книги отсутствуют")); } }