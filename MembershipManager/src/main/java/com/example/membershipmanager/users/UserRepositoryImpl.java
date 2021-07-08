package com.example.membershipmanager.users;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return UserDataStub.addUser(user);
    }

    @Override
    public Set<User> getTradesmans() {
        final var members = UserDataStub.getUsers();
        return members.stream()
                .filter(member -> member.getRole() == Role.TRADESMAN)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<User> getWorkers() {
        final var members = UserDataStub.getUsers();
        return members.stream()
                .filter(member -> member.getRole() == Role.WORKER)
                .collect(Collectors.toSet());
    }
}
