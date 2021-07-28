package com.example.membershipmanager.disputes;

import com.example.membershipmanager.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/dispute")
public class DisputeController {
    private final KafkaProducer producer;
    private final DisputeService disputeService;

    @PostMapping
    public ResponseEntity<String> save(
    ) {
        return ResponseEntity.ok("ok");
    }
}
