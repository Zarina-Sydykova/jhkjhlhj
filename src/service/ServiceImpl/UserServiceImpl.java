package service.ServiceImpl;

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
        for (User u:userList) {
            if (u.getId()== u.getId().longValue()){
                System.out.println(u);
            }

        }
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        for (User u:userList){
            if (u.getName().equals(u.getName()){


            }
        }
        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {
        userList.collect(Collectors.groupingBy(x -> new ArrayList<String>(Arrays.asList(x.getGender.MALE, x.getGender.FEMALE())), Collectors.toSet()));


    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
