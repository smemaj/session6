package lhind.internship.repository.impl;

import lhind.internship.config.EntityManagerConfig;
import lhind.internship.model.entity.User;
import lhind.internship.repository.UserRepository;
import lhind.internship.util.Queries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    public UserRepositoryImpl() {
        entityManager = EntityManagerConfig.getEntityManager();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.ofNullable(entityManager.find(User.class, id));
    }

    @Override
    public List<User> findAll() {
        TypedQuery<User> result = entityManager.createQuery(Queries.FIND_ALL_USERS, User.class);
        return result.getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.getTransaction().begin();
        if (user.getId() != null) {
            findById(user.getId()).ifPresent(existingUser -> {
                user.setUsername(user.getUsername());
                user.setPassword(user.getPassword());
                user.setRole(user.getRole());
            });
        } else {
            entityManager.persist(user);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(User user) {
        if (user.getId() != null) {
            entityManager.getTransaction().begin();
            findById(user.getId()).ifPresent(entityManager::remove);
            entityManager.getTransaction().commit();
        }

    }

    @Override
    public Optional<User> findByUsername(String username) {
        TypedQuery<User> result = entityManager.createQuery(Queries.FIND_USER_BY_USERNAME, User.class);
        result.setParameter("username", username);
        return Optional.ofNullable(result.getSingleResult());
    }
}
