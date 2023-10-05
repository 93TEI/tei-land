package com.example.teiland.domain.admin.service;

import com.example.teiland.common.entity.Admin;
import com.example.teiland.domain.admin.AdminRepository;
import com.example.teiland.domain.admin.dto.EmployReq;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Transactional
    public Long employ(EmployReq req) {
        Admin admin = new Admin(req);
        return adminRepository.save(admin).getId();
    }

}
