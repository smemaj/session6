package lhind.internship.service;

import lhind.internship.model.dto.UserDTO;
import lhind.internship.model.entity.User;

import java.util.List;

public interface UserService {

    List<UserDTO> loadAllUsers();

    void save(UserDTO userDTO);

    List<UserDTO> loadUsersByUsername(String username);
}
