package com.example.membershipmanager.users;

import java.util.Set;

public interface UserRepository {
    User save(User user);

    Set<User> getTradesmans();

    Set<User> getWorkers();
}
