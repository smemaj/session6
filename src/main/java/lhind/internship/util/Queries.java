package lhind.internship.util;

public class Queries {

    public static String FIND_ALL_USERS = "SELECT u FROM User u";
    public static String FIND_USER_BY_USERNAME = "SELECT u FROM User u WHERE u.username = :username";

    private Queries() {

    }
}
