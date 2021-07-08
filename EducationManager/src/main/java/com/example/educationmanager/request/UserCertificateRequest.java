package com.example.educationmanager.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserCertificateRequest {
    private Long userId;
    private Long certificateId;
}
