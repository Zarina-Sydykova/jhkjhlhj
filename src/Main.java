import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        Scanner scanner = new Scanner(System.in);
        Book [] books = {new Book(1L, "Эрте келген турналар", Genre.ROMANCE, new BigDecimal(450), "Чынгыз Айтматов",
                Language.KYRGYZ, LocalDate.of(2013, 5, 16)),
                new Book(2L, "Война и Мир", Genre.HISTORICAL, new BigDecimal(1000), "Л. Н. Толстой",
                        Language.RUSSIAN, LocalDate.of(1863, 8, 16)),
                new Book(3L, "Ведьмак", Genre.FANTASY, new BigDecimal(680), "Анджей Сапковский",
                Language.RUSSIAN, LocalDate.of(2013, 7, 31)),
                new Book(4L, "Murder on the Orient Express", Genre.DETECTIVE, new BigDecimal(1550), "Agatha Christie",
                Language.KYRGYZ, LocalDate.of(1934, 10, 1)),
                new Book(5L, "Memoirs of a Geishaр", Genre.HISTORICAL, new BigDecimal(450), "Golden Gone with the Wind by Margaret Mitchell",
                Language.KYRGYZ, LocalDate.of(1984, 12, 24)),



        };
        User [] users = {
                new User(6L, "Zarina", "Sydykova", "zarina@gmail.com",
                        "+996507579095", Gender.FEMALE, new BigDecimal(5687), null),
                new User(7L, "Zarina", "Sydykova", "zarina@gmail.com",
                        "+996507579095", Gender.FEMALE, new BigDecimal(5687), null),
                new User(8L, "Zarina", "Sydykova", "zarina@gmail.com",
                "+996507579095", Gender.FEMALE, new BigDecimal(5687), null),
                new User(9L, "Zarina", "Sydykova", "zarina@gmail.com",
                "+996507579095", Gender.FEMALE, new BigDecimal(5687), null),
                new User(10L, "Zarina", "Sydykova", "zarina@gmail.com",
                "+996507579095", Gender.FEMALE, new BigDecimal(5687), null),

        };



    }
}