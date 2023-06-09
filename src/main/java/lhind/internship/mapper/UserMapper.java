package lhind.internship.mapper;

import lhind.internship.model.dto.UserDTO;
import lhind.internship.model.entity.User;

public class UserMapper extends AbstractMapper<User, UserDTO>{

    @Override
    public User toEntity(UserDTO userDTO) {
        if(userDTO == null){
            return null;
        }
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());

        return user;
    }

    @Override
    public UserDTO toDto(User user) {
        if(user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        return userDTO;
    }
}
