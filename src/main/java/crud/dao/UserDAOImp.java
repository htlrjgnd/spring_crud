package crud.dao;

import crud.models.User;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import java.util.List;


@Component
@Transactional
public class UserDAOImp implements UserDAO{


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }


    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void changeUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(Long id) {
         return entityManager.find(User.class, id);
    }


    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
