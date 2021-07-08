package com.example.membershipmanager.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/members")
public class UserController {
    private final UserService userService;

    @PostMapping
    public User register(User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/roles/{roleName}")
    public Set<User> findByRole(
            @PathVariable("roleName") String roleName
    ) {
        return userService.findByRole(roleName);
    }
}
