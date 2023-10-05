package com.example.teiland.domain.admin;

import com.example.teiland.common.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
