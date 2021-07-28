package com.example.membershipmanager.users;

import com.example.membershipmanager.broker.model.UserCertificate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Set<User> findByRole(String roleName) {
        return roleName.equals(Role.TRADESMAN.name().toLowerCase()) ? userRepository.getTradesmans() : userRepository.getWorkers();
    }

    @Override
    public Set<User> setUserSkill(UserCertificate userCertificate) {
        System.out.println("On sauvegarde le skill");
        return null;
    }
}
