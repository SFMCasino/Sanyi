package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaCasinoDAO implements SFMCasinoDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public void findUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.contains(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateUser(User user) {
        deleteUser(user);
        saveUser(user);
    }


    @Override
    public List<User> getUser() {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT user FROM User user", User.class);
        List<User> users = query.getResultList();
        return users;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
