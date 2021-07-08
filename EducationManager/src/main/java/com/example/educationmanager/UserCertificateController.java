package com.example.educationmanager;

import com.example.educationmanager.model.UserCertificate;
import com.example.educationmanager.repository.UserCertificateDao;
import com.example.educationmanager.request.UserCertificateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user-certificate")
public class UserCertificateController {
    private final UserCertificateDao userCertificateDao;
    @PostMapping
    public ResponseEntity<URI> create(
            @RequestBody UserCertificateRequest request
    ) {
        var userCertificate = userCertificateDao.saveOne(
                new UserCertificate().setUserId(request.getUserId()).setCertificateId(request.getCertificateId())
        );
        
        var uri = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .buildAndExpand(userCertificate.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }
}
