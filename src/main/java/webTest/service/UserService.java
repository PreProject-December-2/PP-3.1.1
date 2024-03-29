package webTest.service;//package web.service;


import java.util.List;
import webTest.model.User;

public interface UserService {
    public List<User> getAllUser();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}

