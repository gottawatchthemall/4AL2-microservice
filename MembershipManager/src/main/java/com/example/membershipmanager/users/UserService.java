package com.example.membershipmanager.users;

import java.util.Set;

public interface UserService {
    User registerUser(User user);

    Set<User> findByRole(String roleName);
}
