package lhind.internship.mapper;

import lhind.internship.model.dto.UserDTO;
import lhind.internship.model.entity.User;

public class UserMapper extends AbstractMapper<User, UserDTO>{

    @Override
    public User toEntity(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO toDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        return userDTO;
    }
}
