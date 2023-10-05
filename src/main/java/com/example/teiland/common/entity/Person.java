package com.example.teiland.common.entity;

import com.example.teiland.common.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {

    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int height;
    private int weight;

}
