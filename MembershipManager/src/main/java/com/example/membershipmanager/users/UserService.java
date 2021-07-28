package com.example.membershipmanager.users;

import com.example.membershipmanager.broker.model.UserCertificate;

import java.util.Set;

public interface UserService {
    User registerUser(User user);

    Set<User> findByRole(String roleName);

    Set<User> setUserSkill(UserCertificate userCertificate);
}
