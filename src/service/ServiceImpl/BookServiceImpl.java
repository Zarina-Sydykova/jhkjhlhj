package service.ServiceImpl;

import enums.Genre;
import enums.Language;
import model.Book;
import service.BookService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class BookServiceImpl implements BookService {
    Scanner sc = new Scanner(System.in);
    private final List<Book> bookList = new ArrayList<>();

    @Override
    public List<Book> createBooks(List<Book> books) {
    this.bookList.addAll(books);
        return this.bookList;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookList;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookList.stream().filter(x -> x.getName().equals(genre)).toList();
    }

    @Override
    public Book removeBookById(Long id) {
        for (Book book : bookList) {
            if (book.getId().longValue()==id){
                bookList.remove(book);
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        List<Book>books= bookList.stream().
                sorted(Comparator.comparing(Book::getPrice).reversed()).toList();
        books.forEach(System.out::println);

        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        List<Book>books= bookList.stream().
                sorted(Comparator.comparing(Book::getPublishedYear).reversed()).toList();
        books.forEach(System.out::println);

        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        System.out.println(bookList.stream().filter(z-> z.getName().startsWith("Э")).toList());
        return bookList.stream().filter(x-> x.getName().startsWith("A")).toList();
    }

    @Override
    public Book maxPriceBook() {
//        Optional<Book> max = bookList.stream().max(Comparator.comparing(Book::getPrice));
//        System.out.println(max);
        return bookList.stream().sorted(Comparator.comparing(Book::getPrice)).findAny().orElseThrow();
    }
}
