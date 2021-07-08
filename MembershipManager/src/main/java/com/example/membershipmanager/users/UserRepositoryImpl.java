package com.example.membershipmanager.users;

import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return UserDataStub.addUser(user);
    }
}
