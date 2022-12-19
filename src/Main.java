import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.ServiceImpl.BookServiceImpl;
import service.ServiceImpl.UserServiceImpl;

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
                new User(7L, "Nurlan", "Nurseyitov", "nurlan@gmail.com",
                        "+996507579109", Gender.MALE, new BigDecimal(10648), null),
                new User(8L, "Altynbek", "Sadirov", "altynbek@gmail.com",
                "+99655578595", Gender.MALE, new BigDecimal(6877), null),
                new User(9L, "Ayyup", "Abdusomatov", "ayyup@gmail.com",
                "+996705501244", Gender.MALE, new BigDecimal(1000), null),
                new User(10L, "Eliza", "Damirova", "eliza@gmail.com",
                "+996555781095", Gender.FEMALE, new BigDecimal(9714), null),

        };
        BookServiceImpl service = new BookServiceImpl();
        UserServiceImpl service1 = new UserServiceImpl();

        while (true){
            System.out.println("Books' actions are: ");
            int action=scanner.nextInt();
            switch (action){
                case 1-> System.out.println(service.createBooks(List.of(books)));
                case 2-> System.out.println(service.getAllBooks());
//                case 3-> service.getBooksByGenre();
//                case 4-> service.removeBookById();
                case 5-> System.out.println(service.sortBooksByPriceInDescendingOrder());
                case 6-> System.out.println(service.filterBooksByPublishedYear());
                case 7-> System.out.println(service.getBookByInitialLetter());
                case 8-> System.out.println(service.maxPriceBook());
//                System.out.println("Users' actions are: ");
                case 9-> System.out.println(service1.createUser(List.of(users)));
                case 10-> System.out.println(service1.findAllUsers());
//                case 11-> service1.findUserById();
                case 12-> System.out.println(service1.removeUserByName(scanner.nextLine()));
                case 13-> service1.updateUser(scanner.nextLong());
                case 14-> service1.groupUsersByGender();
//                case 15-> service1.buyBooks();
            }
        }



    }
}