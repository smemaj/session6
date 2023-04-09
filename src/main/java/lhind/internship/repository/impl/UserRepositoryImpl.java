package lhind.internship.repository.impl;

import lhind.internship.model.entity.User;
import lhind.internship.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }
}
