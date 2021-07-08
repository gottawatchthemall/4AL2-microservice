package com.example.educationmanager.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserCertificate {
    private Long userId;
    private Long certificateId;
}
