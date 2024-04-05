package com.example.Jinus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

// 인문대학
@Entity
@Getter
@Setter
@Table(name = "inmun-category")
public class InmunCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_id")
    private int departmentId;
}
