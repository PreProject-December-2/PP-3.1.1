package webTest.DAO;//package web.DAO;


import java.util.List;
import webTest.model.User;

public interface UserDao {
    public List<User> getAllUser();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
