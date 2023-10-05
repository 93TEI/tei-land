package com.example.teiland.domain.admin.controller;

import com.example.teiland.domain.admin.dto.EmployReq;
import com.example.teiland.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("admin")
public class AdminController {

    private final AdminService adminService;

    @PostMapping
    public Long employ(@RequestBody EmployReq req){
        return adminService.employ(req);
    }
}
