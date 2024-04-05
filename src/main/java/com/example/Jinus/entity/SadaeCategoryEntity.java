package com.example.Jinus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

// 사범대학
@Entity
@Getter
@Setter
@Table(name = "sadae-category")
public class SadaeCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_id")
    private int departmentId;
}
