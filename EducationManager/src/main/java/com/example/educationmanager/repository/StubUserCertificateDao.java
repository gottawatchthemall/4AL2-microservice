package com.example.educationmanager.repository;

import com.example.educationmanager.model.UserCertificate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StubUserCertificateDao implements UserCertificateDao {

    private final List<UserCertificate> userCertificatesList;
    public StubUserCertificateDao() {
        userCertificatesList = new ArrayList<>();
    }

    @Override
    public UserCertificate saveOne(UserCertificate userCertificate) {
        userCertificate.setId((long) userCertificatesList.size());
        userCertificatesList.add(userCertificate);
        return userCertificate;
    }
}
