package service.ServiceImpl;

import enums.Gender;
import model.Book;
import model.User;
import service.UserService;

import java.util.*;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private final List<User>userList=new ArrayList<>();
    @Override
    public String createUser(List<User> users) {
        this.userList.addAll(users);
        return this.userList.toString();
    }

    @Override
    public List<User> findAllUsers() {
        return this.userList;
    }

    @Override
    public User findUserById(Long id) {

        return userList.stream().filter(user -> user.getId().equals(id)).findAny().orElseThrow();
    }

    @Override
    public String removeUserByName(String name) {
        for (User u:userList){
            if (u.getName().equals(name)){
                userList.remove(u);

            }
        }
        return null;
    }

    @Override
    public void updateUser(Long id) {
        User user = (User) userList.stream().filter(x->x.getId().equals(id));
        user.setId(new Scanner(System.in).nextLong());
        user.setEmail(new Scanner(System.in).nextLine());
    }

    @Override
    public void groupUsersByGender() {
        userList.stream().filter(user -> user.getGender().equals(Gender.FEMALE)).toList();
        userList.forEach(System.out::println);
        userList.stream().filter(user -> user.getGender().equals(Gender.MALE)).toList();
        userList.forEach(System.out::println);


    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        for (User user : userList) {
            if (user.getName().equals(name)){
                for (Book book: books){
                    if (book.getName().equals(name)){
                        userList.add(user);
                        books.add(book);
                    }
                }
            }
        }
        return null;
    }
}
