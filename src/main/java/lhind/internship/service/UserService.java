package lhind.internship.service;

import lhind.internship.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> loadAllUsers();
}
