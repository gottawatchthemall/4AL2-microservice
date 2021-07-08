package com.example.educationmanager;

import com.example.educationmanager.model.Certificate;
import com.example.educationmanager.model.UserCertificate;
import com.example.educationmanager.repository.CertificateDao;
import com.example.educationmanager.repository.UserCertificateDao;
import com.example.educationmanager.request.CertificateRequest;
import com.example.educationmanager.request.UserCertificateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/certificate")
public class CertificateController {
    private final CertificateDao certificateDao;
    private final UserCertificateDao userCertificateDao;
    @PostMapping
    public ResponseEntity<Certificate> save(
            @RequestBody CertificateRequest request
    ) {
        var savedCertificate = certificateDao.saveOne(new Certificate().setName(request.getName()));

        var certificateUri = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .buildAndExpand(savedCertificate.getId())
                .toUri();
        return ResponseEntity.created(certificateUri).build();
    }

    @GetMapping()
    public ResponseEntity<List<Certificate>> findAll() {
        var listCertificate = certificateDao.findAll();
        return ResponseEntity.ok(listCertificate);
    }

    @GetMapping("{id}")
    public ResponseEntity<Certificate> findOne(
            @PathVariable("id") Long id
    ) {
        var maybeCertificate = certificateDao.findById(id);
        return ResponseEntity.ok(maybeCertificate.get());
    }

    @PostMapping()
    public ResponseEntity<URI> createUserCertificate(
            @RequestBody UserCertificateRequest request
    ) {
        return null;
    }
}
