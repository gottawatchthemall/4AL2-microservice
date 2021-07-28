package com.example.membershipmanager.users;

import com.example.membershipmanager.KafkaProducer;
import com.example.membershipmanager.broker.model.TradesmanAffectedToProject;
import com.example.membershipmanager.broker.model.WorkerParticipateToProject;
import com.example.membershipmanager.request.TradesmanAffectedToProjectRequest;
import com.example.membershipmanager.request.WorkerParticipateToProjectRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/members")
public class UserController {
    private final KafkaProducer producer;
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

    @PostMapping("worker/add/project")
    public ResponseEntity<String> WorkerParticipateToProject(
        @RequestBody WorkerParticipateToProjectRequest request
    ) {
        this.producer.WorkerParticipateToProject(new WorkerParticipateToProject(request.getProjectId(), request.getUserId()));
        return ResponseEntity.ok("ok");
    }

    @PostMapping("tradesman/add/project")
    public ResponseEntity<String> TradesmanAffectedToProject(
        @RequestBody TradesmanAffectedToProjectRequest request
    ) {
        this.producer.TradesmanAffectedToProject(new TradesmanAffectedToProject(request.getProjectId(), request.getWorkerId()));
        return ResponseEntity.ok("ok");
    }
}
