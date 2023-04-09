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
    public Optional<User> findById(Integer integer) {
        return Optional.empty();
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

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }
}
