package crud.service;

import crud.dao.UserDAO;
import crud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Override
    public void changeUser(User user) {
        userDAO.changeUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
