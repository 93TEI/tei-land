package com.example.teiland.common.entity;

import com.example.teiland.common.enums.Position;
import com.example.teiland.domain.admin.dto.EmployReq;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Admin extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Position position;

    public Admin(EmployReq req) {
        super(req.getName(), req.getAge(), req.getGender(), req.getHeight(), req.getWeight());
        this.position = req.getPosition();
    }

}
