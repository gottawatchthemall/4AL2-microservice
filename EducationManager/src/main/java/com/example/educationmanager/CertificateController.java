package com.example.educationmanager;

import com.example.educationmanager.broker.model.UserCertificate;
import com.example.educationmanager.model.Certificate;
import com.example.educationmanager.repository.CertificateDao;
import com.example.educationmanager.repository.UserCertificateDao;
import com.example.educationmanager.request.CertificateRequest;
import com.example.educationmanager.request.UserCertificateRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.concurrent.Future;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/certificate")
public class CertificateController {
    private final KafkaProducer producer;
    private final CertificateDao certificateDao;

    @PostMapping
    public ResponseEntity<Certificate> save(
            @RequestBody CertificateRequest request
    ) throws JsonProcessingException {
        var savedCertificate = certificateDao.saveOne(new Certificate().setName(request.getName()));
        var userCertificate = new UserCertificate(request.getUserId(), request.getName());

        this.producer.saveUserCertificate(userCertificate);

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

}
