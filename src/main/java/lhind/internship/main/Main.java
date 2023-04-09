package lhind.internship.main;

import lhind.internship.model.entity.User;
import lhind.internship.model.enums.UserRole;
import lhind.internship.service.UserService;
import lhind.internship.service.impl.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        User user = new User();
        user.setUsername("User1");
        user.setPassword("Pass1");
        user.setRole(UserRole.BASIC_USER);

        UserService userService = new UserServiceImpl();

        userService.loadAllUsers();
    }
}