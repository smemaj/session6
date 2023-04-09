package lhind.internship.repository;

import lhind.internship.model.entity.User;

import java.util.Optional;

public interface UserRepository extends BaseRepository<User, Integer>{

    Optional<User> findByUsername(String username);

}
