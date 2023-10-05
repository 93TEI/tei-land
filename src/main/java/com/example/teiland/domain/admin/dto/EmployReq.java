package com.example.teiland.domain.admin.dto;

import com.example.teiland.common.enums.Gender;
import com.example.teiland.common.enums.Position;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmployReq {

    private String name;
    private int age;
    private Gender gender;
    private int height;
    private int weight;
    private Position position;

}
