package com.example.educationmanager.repository;


import com.example.educationmanager.model.Certificate;

import java.util.List;
import java.util.Optional;

public interface CertificateDao {
    Certificate saveOne(Certificate certificate);

    List<Certificate> findAll();

    Optional<Certificate> findById(Long id);
}
