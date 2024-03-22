package webTest.service;//package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webTest.DAO.UserDao;

import java.util.List;

import webTest.model.User;


@Service
public class UserServiceImp implements UserService {


    private final UserDao userDao;


    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
