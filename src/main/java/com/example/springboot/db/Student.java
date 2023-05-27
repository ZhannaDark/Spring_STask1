package com.example.springboot.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam_score;
    private String mark;
}
