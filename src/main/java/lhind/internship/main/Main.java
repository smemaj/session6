package lhind.internship.main;

import lhind.internship.mapper.UserMapper;
import lhind.internship.model.entity.User;
import lhind.internship.model.enums.UserRole;
import lhind.internship.service.UserService;
import lhind.internship.service.impl.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        UserMapper userMapper = new UserMapper();
        User user = new User();
        //user.setId(12);
//        user.setUsername("User1");
//        user.setPassword("Pass1");
//        user.setRole(UserRole.BASIC_USER);

        UserService userService = new UserServiceImpl();

//        userService.loadAllUsers();
//        userService.save(userMapper.toDto(user));
//        userService.loadAllUsers();


        System.out.println(userService.loadUsersByUsername("User1"));


    }
}