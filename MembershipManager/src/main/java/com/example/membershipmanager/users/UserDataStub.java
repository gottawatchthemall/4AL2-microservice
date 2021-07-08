package com.example.membershipmanager.users;

import java.util.List;

public class UserDataStub {
    private static List<User> users;

    public static List<User> getUsers() {
        return users;
    }

    public static User addUser(User user) {
        users.add(user);
        return user;
    }
}
