package lhind.internship.service.impl;

import lhind.internship.mapper.UserMapper;
import lhind.internship.model.dto.UserDTO;
import lhind.internship.repository.impl.UserRepositoryImpl;
import lhind.internship.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl() {
        this.userRepository = new UserRepositoryImpl();
        this.userMapper = new UserMapper();
    }

    @Override
    public List<UserDTO> loadAllUsers() {
        return userRepository.findAll().stream().map(userMapper::toDto).collect(Collectors.toList());
    }
}
