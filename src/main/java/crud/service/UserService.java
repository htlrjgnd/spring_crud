package crud.service;

import crud.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void changeUser(User user);
    User getUser(Long id);
    void delete(Long id);
}

