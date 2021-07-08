package com.example.educationmanager.repository;

import com.example.educationmanager.model.Certificate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StubCertificateDao implements CertificateDao {
    private final List<Certificate> certificateList;
    public StubCertificateDao() {
        certificateList = new ArrayList<>();
        certificateList.add(new Certificate().setId(1L).setName("ESGI"));
        certificateList.add(new Certificate().setId(2L).setName("Un diplome"));
        certificateList.add(new Certificate().setId(3L).setName("21 en russie"));
    }

    @Override
    public Certificate saveOne(Certificate certificate) {
        certificate.setId((long) certificateList.size());
        certificateList.add(certificate);
        return certificate;
    }

    @Override
    public List<Certificate> findAll() {
        return certificateList;
    }

    @Override
    public Optional<Certificate> findById(Long id) {
        return certificateList.stream()
                .filter(certificate -> certificate.getId().equals(id))
                .findFirst();
    }
}
